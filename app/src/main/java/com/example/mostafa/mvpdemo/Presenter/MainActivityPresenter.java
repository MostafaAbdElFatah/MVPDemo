package com.example.mostafa.mvpdemo.Presenter;

import com.example.mostafa.mvpdemo.Model.User;

public class MainActivityPresenter {

    private User user;
    private IView view;

    public MainActivityPresenter(IView view){
        this.user = new User();
        this.view = view;
    }

    public void updateName(String name){
        this.user.setName(name);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email){
        this.user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }


    public interface IView{
        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();
    }
}
