package com.vk.lib;

import com.vk.config.SHA256PasswordEncoder;

/**
 * Created by KIP-PC99 on 16.01.2019.
 */
public class test {

    public static void main(String[] args){
        SHA256PasswordEncoder passwordEncoder = new SHA256PasswordEncoder();
        String encoded = passwordEncoder.encode("rubicon");
        System.out.println(encoded);
        System.out.println(passwordEncoder.matches("rubicon", encoded));
    }
}
