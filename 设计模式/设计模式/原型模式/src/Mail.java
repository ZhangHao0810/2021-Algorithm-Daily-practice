/**
 * @author ZhangHao
 * @date 2019/11/20 19:11
 * @Description： 邮件类
 */
public class Mail implements Cloneable{
        //姓名
        private  String name;
        //地址
        private  String address;
        //内容
        private  String content;
        public    Mail(){
            System.out.println("发送一个邮件啦(Mail构造)");
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        protected Mail clone() throws CloneNotSupportedException {
            System.out.println("发送一个邮件啦 Mail中重写的clone()方法");
            Mail mail=null;
            try {
                mail= (Mail) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return mail;
        }
}
