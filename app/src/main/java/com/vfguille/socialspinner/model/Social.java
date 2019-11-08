package com.vfguille.socialspinner.model;

import androidx.annotation.Nullable;

import java.util.Objects;

/**
 * Los objetos se ordenan por el nombre (orden natural).
 */
public class Social implements Comparable<Social>{
    private int icon;
    private String name;
    private int totalUsers;
    private int dollars;

    public Social(int icon, String name, int totalUsers, int dollars) {
        this.icon = icon;
        this.name = name;
        this.totalUsers = totalUsers;
        this.dollars = dollars;
    }

    public Social(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }

    public int getDollars() {
        return dollars;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    /**
     * Método por defecto que es llamado cuando se tiene una lista de datos.
     * @param social
     * @return < 0 si el objeto es menor al parámetro.
     * @return = 0 el objeto es igual al que se le pasa.
     * @return > 0 si el objeto es mayor que el que se le pasa.
     */
    @Override
    public int compareTo(Social social) {
        return name.compareTo(social.name);
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj != null)
            return name.equals(((Social)obj).name);
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}