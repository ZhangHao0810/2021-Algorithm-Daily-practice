/**
 * @author ZhangHao
 * @date 2019/11/20 19:16
 * @Description： 调用
 */
public class MailClient {
    public static void main(String[] args) {
        try {
            Mail mail=new Mail();
            Mail mail_clone=mail.clone();
            for (int i=0;i<10;i++){
                mail_clone.setName("姓名"+i);
                mail_clone.setAddress("www.xxx"+i+".com");
                mail_clone.setContent("xxxxx");
                sendMail(mail_clone);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }



    public static void sendMail (Mail mail){

        System.out.println(mail.getName()+"  邮件发送成功了");
    }
}

/*输出结果:
        发送一个邮件啦
        发送一个邮件啦2
        姓名0邮件发送成功了
        姓名1邮件发送成功了
        姓名2邮件发送成功了
        姓名3邮件发送成功了
        姓名4邮件发送成功了
        姓名5邮件发送成功了
        姓名6邮件发送成功了
        姓名7邮件发送成功了
        姓名8邮件发送成功了
        姓名9邮件发送成功了*/
