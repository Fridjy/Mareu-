package com.fridjy.mareu;

public interface BaseMvp {

    interface BaseView<T> {
        void setPresenter(T presenter);
    }

    interface BasePresenter {
        void start();
    }
}
