package com.vfguille.socialspinner.model;

import java.util.Comparator;

/**
 * Se usa para comparar cuando no es el orden natural.
 */
public class SocialComparator implements Comparator<Social> {
    @Override
    public int compare(Social social, Social social2) {
        if (social.getTotalUsers() < social2.getTotalUsers())
            return 1;
        else if (social.getTotalUsers() == social2.getTotalUsers())
            return Integer.compare(social.getDollars(), social2.getDollars());
        else
            return -1;
    }
}