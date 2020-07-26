package com.guide.entity.subscription;

public enum SubscriptionType {
    DAILY("DAILY"),
    MONTHLY("MONTHLY"),
    YEARLY("YEARLY");

    private String type;

    SubscriptionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
