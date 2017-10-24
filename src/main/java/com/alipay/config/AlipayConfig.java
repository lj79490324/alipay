package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016080700187770";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDCJyiEIJEYP4BWanIfxDUpbLZsqT9ngTS45uAGF45xeOSrQeBdKsjH3eW2feYpnoFakNSZBKTHVrZc0jt/dhOXsw762h/Uv97tzJmUdPZhfHKC5hbaXJCV8gFpIi19GeswIExhjYO26PQ8bTSlmqQd52hVKinI5/5xMys0S9V/45HAwI+/LQ2YNQG0437+FvR/xgLwJ5WJsYo180729U/JE+cl045hnooWLgzNonv81H+Aq8pG8FOZh3e1rUrIoIVox+5CNhiVFuN/bRWgM7CMFkJ6lYngeZIOkYEpEDRSXpfk7v/7udSebqUV+HEJRxMKYCUkayEIjaUdRPDM3gOVAgMBAAECggEBALs/VN4JIqaGJ9owExz7+GGZTV8C4/mJLTXexNRbR6+8bp2UjTSNnNLV+UPFrIMbMZoM8F0bk2gFAyAGSgel80NtF9drIyPmYLRrjPsWysA+a5o/Gm9CstdKbX3dzo1GwALMQ54aA5wWk+brU8kbmYiVs5PfdCklRcobFWH8eU46lLKhF+0mSS2rGuxjzI5gldhxR6VGXJ4NSTUG+K/jwaZu/TqcMO+2tlj0oSZZhJnMn6tTQubhwxu74ElMbcOYq4RWgQf7qXSUibuZWiXfOYjHOmrRHK6Qes+DpqxOsrnxrCCkkHKZJv429QIxS2V5e4PADMpzD4djPRM4oqV8pcECgYEA/YZrzVsGCMuMrnsYifqENGIqBbyHaJZlnhEL2MGdn6xDiUmDcjxkfUphC/TGcrPdtGCeHmYX+3Fpn7FFrK7HVO+McgbJiFYuOfs8Egf5rzCSjRt8KCCBd5IjRLyU6u6kDIZxAAwSOHXqVHX1JnP8VDBcSxB9yCYVSfRFYWGTl1kCgYEAxAxckvY6Uia5zbclItZ3Dc+8FTemz3HVtwMAunWsxPI+RHeX/MwATzSPgQBILI6uF/mOWt9swOwnGDFTxF4cCcoj2cAZbBedBLo3pj1TShNcOtwAq1P39+F5bh7XQ31jst2oubdh15HjaOntvNJE2jnvTot1a2BTDz2M6AWXgp0CgYEAqLDDlD2nszx1XDet6UlWpGBY475BPzcrYFSpVE3oKrF9sqDGpMFIgBF4p3L0hKfnsjjDnSiDdpxNEqPq327gVUSbZ9faSyxEz/G6U6kY2xfvu5J5N14Bp2UGsJrmX7fwUiE2mThu+0CCbjaaqz5rvDz9fDj56K5mZfHyJEy/3ukCgYEAghl9+ZzjOQ8v8F9giozuNsErnJzw2us9GxUoD5T10UC8p60BtKYgcm975+yq+L66s3hNyupH/oL4sqpRX5fgXXLCdcdwV3YYIkH9mhlKQ3czlm/XFdtETEBZ2AUpb0Uvu0wzowMaL/dFhaLvvIWBYZxeva34fwhONmfvMS48zFUCgYBJ/C2Pc9X9cBctoSFaDWrnddiK8EVvZ5pEdZCdAZ+OZzCjTNhaqm70xWYc+jBaJxDkXzTytBNrfhyieVmLUXc/T/VR9GDj7r9SKPFkadV7tVuLSDdQwiLLVmNdGCNJmGqcxsuICg2WmqoC4Q5dbxvFkvewbpTPPZcM9Nl4nBBgNw==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApiRuPcU0Bow9ChiBIAXlzPIrF8FefAQMCXEI4W04/1Kr/VrQN9JPci/HH2orRI5QFVwcnFr47XskyumS/m5Imx0p39JwLclbuI9EAZXMeYdziCb7ehz1LKaMgC3LbAo4Jhz5FCv1F7x+eq15FG2gmcmHMlhvtNSDmpttkzltgJq9k4OgK//MbtfYsTJn1oxmHL/PNWVA6N38qgu3EgnQB6GrCkxrCnAQTc8/PU1Rs8PrePyte7LtO3co+na7FSQgRdNv1zyTDsH399LivJGXoVFSdKTPOlAH0lcn4wNS9tcCx9ZSnCDmixLaeN5uNj6Fo792HuJM7ndpONJR1TG1owIDAQAB";
    //异步返回的参通知
    //  public static String notify_url = "http://120.25.245.88:8080/alipay/notify_url.jsp";
    public static String notify_url = "http://120.25.245.88:8080/alipay/Notify";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    //  public static String return_url = "http://127.0.0.1:8080/alipay/return_url.jsp";

    public static String return_url = "http://120.25.245.88:8080/alipay/return_url.jsp";
    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "/home/workspace/log";


    /**
     * 测试方法
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
