package com.licc.common.util;
import java.util.Map;
/**
 * Created by lichangchao on 2016/8/24.
 */
public class QueryParametersUtil<V> {

    /**
     * @param  v  对象参数
     * @return 当前对象本身
     */
    public static <V>  QueryParameters  addParam(V v) {
        QueryParameters  parameters =  new QueryParameters();
        parameters.addParams( BeanMapper.map(v,Map.class));
        return parameters;
    }

    /**
     * @param  v  对象参数
     * @param  from 开始页数
     * @param  size 每页数量
     * @return 当前对象本身
     */
    public static <V>  QueryParameters  addParam(V v,int from ,int size) {
        QueryParameters  parameters =  new QueryParameters();
        parameters.addParams( BeanMapper.map(v,Map.class));
        parameters.setPage(new PageInfo(from,size));
        return parameters;
    }


}
