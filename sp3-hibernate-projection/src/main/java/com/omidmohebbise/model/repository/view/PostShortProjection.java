package com.omidmohebbise.model.repository.view;

public interface PostShortProjection {
    String getId();

    String getTitle();

    default void println() {
        System.out.println("Id: " + getId() + "\tTitle: " + getTitle());
    }
}
