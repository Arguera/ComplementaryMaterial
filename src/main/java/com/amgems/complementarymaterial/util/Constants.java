package com.amgems.complementarymaterial.util;

public final class Constants {
    private Constants() {
        throw new AssertionError("Cannot instantiate utility class");
    }

    // * Basic Routes
    public static final String API = "/api";
    public static final String CATEGORY_PATH = "/category";
    public static final String AUTHOR_PATH = "/author";

    // * Method Routed
    public static final String CREATE = "/create";
    public static final String FIND_ALL = "/findAll";
    public static final String FIND_BY_ID = "/findById";
    public static final String DELETE = "/delete";
    public static final String EDIT = "/edit";
}
