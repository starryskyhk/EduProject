package com.yuxiu.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseController<T> {
    public  static String MANAGE_PATH;//管理界面
    public  static String INFO_PATH;//列表页面
    public  static String EDIT_PATH;//编辑页面

    public static final String MANAGE="manage";
    public static final String INFO="info";
    public static final String EDIT="edit";

    public BaseController() {
        System.out.println("抽象控制器");
        //1:获取泛型的真实类型
        ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        //System.out.println("type:"+type);
        Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];
        //System.out.println("modelClass:"+modelClass);
        //2模块名
        String moduleName = modelClass.getSimpleName().toLowerCase();
        //3给静态页面赋值
        MANAGE_PATH = moduleName+"/"+MANAGE;
        INFO_PATH = moduleName+"/"+INFO;
        EDIT_PATH = moduleName+"/"+EDIT;


    }
}
