package com.company.spsolutions.gestosdecompras.Login;
/**
 * Created by coralRodriguez on 27/03/19.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.company.spsolutions.gestosdecompras.Login.PresenterLogin;
import com.company.spsolutions.gestosdecompras.R;

public class LoginActivity extends AppCompatActivity  implements PresenterLogin {
/*
* Esta clase se encarga de gestionar la vista del login
* initCompinents debe inicializar los componentes con sus respectivos listeners, intents,
* displayEmailError implementa el método de la interfaz para mostrar un error si el email es invalido
* displayPasswordError implementa el método de la interfaz para mostrar un error si el password es invalido
* displaySigninError implementa el método de la interfaz para mostrar un error si ocurrio un error al iniciar sesion (contraseña erronea, sin conexión,etc)
* displayLoader implementa el método de la interfaz para mostrar un  loader mientras se espera la respuesta de firebase
* successLogin implementa el método de la interfaz para mostrar la siguiente interacción si el login es exitoso
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void initComponents(){

    }


    @Override
    public void displayEmailError(String error) {

    }

    @Override
    public void displayPasswordError(String error) {

    }

    @Override
    public void displaySigninError(String error) {

    }

    @Override
    public void displayLoader(boolean loader) {

    }


    @Override
    public void successLogin() {

    }
}
