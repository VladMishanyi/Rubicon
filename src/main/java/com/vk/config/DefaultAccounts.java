package com.vk.config;

import com.vk.entity.user.User;
import com.vk.enumeration.UserRole;
import org.apache.log4j.Logger;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static com.vk.lib.ObjectValidator.isNotNull;

public final class DefaultAccounts {


    private static final Logger LOGGER = Logger.getLogger(DefaultAccounts.class);

    private final static Map<String, User> USERS;

    static {
        USERS = new ConcurrentHashMap<>();
        addDefaultAdmin();
    }

    public static User get(final String username) {
        User user;
        try {
            user = USERS.get(username);
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage(), ex);
            user = null;
        }
        return user;
    }

    public static User getDefaultAdmin() {
        return get("admin");
    }

    public static boolean isDefaultAdmin(final User user) {
        return isNotNull(user) && USERS.containsValue(user);
    }

    private static void addDefaultAdmin() {
        final User user = createUser(
                1,
                new Date(),
                "Default Admin",
                "rubicon",
                "e841114084e394e751751ff5a7c370268d83c0d19918357e39ec79e9fb78686b",
                "create automation",
                UserRole.ADMIN,
                false
        );
        USERS.put(user.getLogin(), user);
    }

    private static User createUser(
            final long id,
            final Date date,
            final String name,
            final String login,
            final String password,
            final String description,
            final UserRole role,
            final boolean locked
    ) {
        final User us = new User(id, date, name, login, password, description, role, locked);
        return us;
    }
}
