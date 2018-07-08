package com.bway.day0707_greeddao.mvp.home.model.bean;

import java.util.List;

public class HomeBean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"人在塔在","createTime":"2018-06-28T14:50:58","imgUrls":null,"jid":3269,"praiseNum":null,"shareNum":null,"uid":15902,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530797853445head_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"嗯嗯","createTime":"2018-06-27T21:01:18","imgUrls":null,"jid":3268,"praiseNum":null,"shareNum":null,"uid":15285,"user":{"age":"age","fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15287055187921512R.jpeg","nickname":"嗯嗯","praiseNum":"null"}},{"commentNum":null,"content":"      今天我 \n      寒夜里看雪飘过  \n      怀着冷却了的心飘远方","createTime":"2018-06-27T19:56:26","imgUrls":null,"jid":3267,"praiseNum":null,"shareNum":null,"uid":15902,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530797853445head_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"明月几时有，把酒问青天，不知天上宫阙，今夕是何年。","createTime":"2018-06-27T19:46:44","imgUrls":null,"jid":3266,"praiseNum":null,"shareNum":null,"uid":15902,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530797853445head_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"啦啦啦啦啦啦啦啦","createTime":"2018-06-27T19:44:46","imgUrls":null,"jid":3265,"praiseNum":null,"shareNum":null,"uid":15902,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530797853445head_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"vgyhh","createTime":"2018-06-27T14:01:47","imgUrls":null,"jid":3264,"praiseNum":null,"shareNum":null,"uid":15416,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"null","praiseNum":"null"}},{"commentNum":null,"content":"w额问问企鹅","createTime":"2018-06-26T19:20:12","imgUrls":null,"jid":3263,"praiseNum":null,"shareNum":null,"uid":3402,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530624374054head_icon.jpg","nickname":"一千一千","praiseNum":"null"}},{"commentNum":null,"content":"啊阿吖嗄锕","createTime":"2018-06-26T19:18:17","imgUrls":null,"jid":3262,"praiseNum":null,"shareNum":null,"uid":3402,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530624374054head_icon.jpg","nickname":"一千一千","praiseNum":"null"}},{"commentNum":null,"content":"什么","createTime":"2018-06-26T19:11:27","imgUrls":null,"jid":3261,"praiseNum":null,"shareNum":null,"uid":3402,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530624374054head_icon.jpg","nickname":"一千一千","praiseNum":"null"}},{"commentNum":null,"content":"啦啦啦啦啦啦啦啦啦啦啦","createTime":"2018-06-26T18:59:35","imgUrls":null,"jid":3260,"praiseNum":null,"shareNum":null,"uid":3402,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530624374054head_icon.jpg","nickname":"一千一千","praiseNum":"null"}}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : null
         * content : 人在塔在
         * createTime : 2018-06-28T14:50:58
         * imgUrls : null
         * jid : 3269
         * praiseNum : null
         * shareNum : null
         * uid : 15902
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1530797853445head_icon.jpg","nickname":null,"praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private Object imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(Object imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : https://www.zhaoapi.cn/images/1530797853445head_icon.jpg
             * nickname : null
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private String icon;
            private Object nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Object getNickname() {
                return nickname;
            }

            public void setNickname(Object nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}
