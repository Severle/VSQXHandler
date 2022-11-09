package com.vsqx.enums;

public enum PRM {
    BRE {
        @Override
        public int getMinValue() {
            return -127;
        }

        @Override
        public int getMaxValue() {
            return 127;
        }
    },
    BRI {
        @Override
        public int getMinValue() {
            return -127;
        }

        @Override
        public int getMaxValue() {
            return 127;
        }
    },
    CLE {
        @Override
        public int getMinValue() {
            return -127;
        }

        @Override
        public int getMaxValue() {
            return 127;
        }
    },
    GEN {
        @Override
        public int getMinValue() {
            return -127;
        }

        @Override
        public int getMaxValue() {
            return 127;
        }
    },
    OPE {
        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 0;
        }
    };

    public abstract int getMinValue();

    public abstract int getMaxValue();
}
