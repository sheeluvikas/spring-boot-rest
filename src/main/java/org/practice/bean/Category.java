package org.practice.bean;

public enum Category {

    ONE_STAR(1),
    TWO_STAR(2),
    THREE_STAR(3);

    private int categoryId;

    Category(int categoryId) {
        this.categoryId = categoryId;
    }
}
