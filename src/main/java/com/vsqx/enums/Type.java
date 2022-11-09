package com.vsqx.enums;

public enum Type {
    STYLE_TYPE_PART {
        @Override
        public String getType() {
            return "pStyle";
        }
    },
    STYLE_TYPE_NOTE {
        @Override
        public String getType() {
            return "nStyle";
        }
    };

    public abstract String getType();
}
