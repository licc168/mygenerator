/*
 * Copyright (c) 2015年4月15日 by XuanWu Wireless Technology Co., Ltd. 
 *             All rights reserved                         
 */
package com.licc.common.util;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;



/**
 * 查询参数
 * Created by lichangchao
 */
public class QueryParameters{

	/**
	 * 匹配参数
	 */
	private Map<String, Object> params;

	/**
	 * 按字段排序
	 */
	private Map<String, String> sorts;

	/**
	 * 分页
	 */
	private PageInfo page;

	/**
	 * 关键字
	 */
	private String keywords;

	public QueryParameters() {

	}

	/**
	 * 添加一个命名参数
	 *
	 * @param key
	 *            参数名称
	 * @param value
	 *            参数值
	 * @return 当前对象本身
	 */
	public QueryParameters  addParam(String key, Object value) {
		Assert.notBlank(key);
		if (value == null || "".equals(value)) {
			return this;
		}
		initParamMap();
		this.params.put(key, value);
		return this;
	}


	/**
	 * 添加一组命名参数
	 *
	 * @param params
	 * @return 当前对象本身
	 */
	public QueryParameters addParams(Map<String, Object> params) {
		if (params != null && !params.isEmpty()) {
			initParamMap();
			for (Map.Entry<String, Object> entry : params.entrySet()) {
				addParam(entry.getKey(), entry.getValue());
			}
		}
		return this;
	}

	/**
	 * 添加一个排序参数
	 * 
	 * @param key
	 *            参数名称
	 * @param ascDesc
	 *            升序或降序
	 * @return 当前对象本身
	 */
	public QueryParameters addSort(String key, String ascDesc) {
		Assert.notBlank(key);
		if (StringUtils.isBlank(ascDesc)) {
			return this;
		}
		initSortMap();
		if ("asc".equalsIgnoreCase(ascDesc)) {
			sorts.put(key, "asc");
		} else if ("desc".equalsIgnoreCase(ascDesc)) {
			sorts.put(key, "desc");
		}
		return this;
	}

	/**
	 * 添加一组排序参数

	 *            参数名称
	 * @param sorts
	 *            升序或降序
	 * @return 当前对象本身
	 */
	public QueryParameters addSorts(Map<String, String> sorts) {
		if (sorts != null && !sorts.isEmpty()) {
			initSortMap();
			for (Map.Entry<String, String> entry : sorts.entrySet()) {
				addSort(entry.getKey(), entry.getValue());
			}
		}
		return this;
	}

	private void initParamMap() {
		if (this.params == null) {
			this.params = new HashMap<String, Object>();
		}
	}

	private void initSortMap() {
		if (this.sorts == null) {
            this.sorts = new LinkedHashMap<String, String>();
        }
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public Map<String, String> getSorts() {
		return sorts;
	}

	public PageInfo getPage() {
		return page;
	}

	public void setPage(PageInfo page) {
		this.page = page;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
