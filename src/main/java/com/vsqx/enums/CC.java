package com.vsqx.enums;

public enum CC {
    BRE {
        @Override
        public String getVID() {
            return "B";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 0;
        }
    },
    BRI {
        @Override
        public String getVID() {
            return "R";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 64;
        }
    },
    CLE {
        @Override
        public String getVID() {
            return "C";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 0;
        }
    },
    DYN {
        @Override
        public String getVID() {
            return "D";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 64;
        }
    },
    GEN {
        @Override
        public String getVID() {
            return "G";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 64;
        }
    },
    GWL {
        @Override
        public String getVID() {
            return "W";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 0;
        }
    },
    PBS {
        @Override
        public String getVID() {
            return "S";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 24;
        }

        @Override
        public int getDefaultValue() {
            return 2;
        }
    },
    PIT {
        @Override
        public String getVID() {
            return "P";
        }

        @Override
        public int getMinValue() {
            return -8192;
        }

        @Override
        public int getMaxValue() {
            return 8191;
        }

        @Override
        public int getDefaultValue() {
            return 0;
        }
    },
    POR {
        @Override
        public String getVID() {
            return "T";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 0;
        }
    },
    XSY {
        @Override
        public String getVID() {
            return "X";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 128;
        }

        @Override
        public int getDefaultValue() {
            return 0;
        }
    };

    public abstract String getVID();

    public abstract int getMinValue();

    public abstract int getMaxValue();

    public abstract int getDefaultValue();
}
