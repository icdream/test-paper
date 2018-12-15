package com.cdream.testpaper.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 常量类
 *
 * @author ZhaoShuai
 * @date 2018/9/9
 */
public class Const {
    /**
     * 当前用户
     */
    public static final String CURRENT_USER = "currentUser";
    public static final String UTF8 = "utf-8";

    public interface ProductListOrderBy {
        Set<String> PRICE_ASC_DESC = Sets.newHashSet("price_asc", "price_desc");
    }

    /**
     * 使用公共类将相同的常量进行归类
     */
    public interface Role {
        /**
         * 普通用户
         */
        int ROLE_CUSTOMER = 0;
        /**
         * 管理员用户
         */
        int ROLE_ADMIN = 1;
    }

    public static final String USERNAME = "username";
    public static final String EMAIL = "email";


}

