package com.mobtexting.dosmartlogin.smartlogin;


import com.mobtexting.dosmartlogin.smartlogin.users.SmartUser;
import com.mobtexting.dosmartlogin.smartlogin.util.SmartLoginException;

/**
 * Copyright (c) 2017 Codelight Studios
 * Created by kalyandechiraju on 22/04/17.
 */

public interface SmartLoginCallbacks {

    void onLoginSuccess(SmartUser user);

    void onLoginFailure(SmartLoginException e);

    SmartUser doCustomLogin();

    SmartUser doCustomSignup();
}
