package com.vsqx.enums;

public enum Style {
    //重音
    ACCENT {
        @Override
        public String getID() {
            return "accent";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 100;
        }
    },
    //音高曲折幅度
    BENDDEP {
        @Override
        public String getID() {
            return "bendDep";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 100;
        }
    },
    //音高曲折时长
    BENDLEN {
        @Override
        public String getID() {
            return "bendLen";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 100;
        }
    },
    //衰减
    DECAY {
        @Override
        public String getID() {
            return "decay";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 100;
        }
    },
    //是否添加下降滑音
    FALLPORT {
        @Override
        public String getID() {
            return "fallPort";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 1;
        }
    },
    //开口度
    OPENING {
        @Override
        public String getID() {
            return "opening";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 127;
        }
    },
    //是否添加上升滑音
    RISEPORT {
        @Override
        public String getID() {
            return "risePort";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 0;
        }
    },
    //自动颤音长度
    VIBLEN {
        @Override
        public String getID() {
            return "vibLen";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 100;
        }
    },
    //自动颤音类型
    VIBTYPE {
        @Override
        public String getID() {
            return "vibType";
        }

        @Override
        public int getMinValue() {
            return 0;
        }

        @Override
        public int getMaxValue() {
            return 6;
        }
    };

    public abstract String getID();

    public abstract int getMinValue();

    public abstract int getMaxValue();
}
