package com.ruanku.farm.config;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 支付宝配置信息
 * @author linhongcun
 *
 */
public class AlipayConfig {

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ APPID（填自己的，下面都是改过的~）
    public static String app_id = "2016101200670949";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 生成公钥时对应的私钥（填自己的，下面都是改过的~）
    public static String private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCPJB+nBrc9ahEXeZ596lxQuGCQEPVQSUWVCadVi862pifc2q7TLRD/tHF3d+MOy/XMBzFtKsgTCy+Q576nEA3lJGzxIBqDjYy4CHAB6TAgIbiZZ1Rsr8MUrbnXWfKjBTWVYIL85Q/onYOWw8pSwcU5ikP8YIMDHISruHbdvAcjwO1gV9JyE4U8s2Yl1v0RqVKGxReSv+vajuiEoG+xJy9z0whKtk/SJuyoEj8siiyn4sk058YWaMOOjJ/ar1qESCpZGHxEZd1vRCidGsO/cEiDfEDvwLZdn8lejTWqnnGNBs7MMMA9U7QJRlxTKX8wMpNcebGs/t7R7J38CeMZeNtBAgMBAAECggEAGiuSlekGa3YO9enIbmEAy8lJ7k0LbMhYrmz7aQqMmpw6QYjB2d4tc3K8JAmJO9VSdSEDil/+AG1VHvsfwk+PGsvUFym1b0Pb7HGueMr3f4hqxbE8oDpqQkeY6KSLVf7H0y24BSCkDfVub4wQW50Nv/1lfKjwiwsVvoeVQ+jyrTh8rYEF7sIA42VmhbHh9yjm8Qm7wC3Jb5X0SxnVC5ayStWpgBLy8oaBrdSRHR8KEeTUvlyhZG8rcWrlJ2o1nRTJa8bXJhQAG9aRP4CErf/8jWFgE75Afocf7td2EjNlmUMlSZ7Pf+Gd1Rmn702cKVlK+wcnhVtbVQOJb90w0AscOQKBgQDBeYQIYt3u+xrShnn4U7Q6NNUR6Q3J+hVpYH00TaenuTjKfsgRpGf0t4l/LNziv7ezmekzJwdKcEv+/a0dxKA9tJFEjjsWp9t724QVNwdVW3RN4zvNdGAdecKkovSt0K4YdqYR4KD09mptc9mmoE8G7UxPBiHD8aY6aHrnh3QODwKBgQC9Zm2A/pai1PfeNP9yBmkFeiIAESgptcHBx1LfqHicP+xnznwhQt3bxddE2vfJI6FZeqkeIRCLLkTulX21DQhmU+6xFw5QVSzUHBjr1yYFi0vRRIg83ERGyx9+61gRUhoZlNLqNo78oiVzXCNf6aKXPQIsPp/mWh/hAQV17MfRrwKBgAv3DOBL5PfDlbwRTve5jXrQC6FI7W5hRfO3YObcKpMn1EhJoOveZANxWlKAHsTzIFQ+H3rnXf8PhNOnMo6Vu2c1hIpd1W+oP92gDMIXHh/8QOwUMn2ZRdxszEnMPh+FuU6P/+M5JhsgJiLQuFQis+B0ynRUp7/rcOFJ1tf8u4OnAoGARYbmR+YtchTv8NhPtZH415PgC1pA/h7Ew9fh6ky0CdfFds3r72HWg6j6v0IKmAHGZ0yJ7I+CvTT9BQBHp0DjhnzlMIkgLgk2bZ7q3xiZ0osyB946jOzm+33xT+wg5irXffCOBICGuOLlEJYQPlNL5mz08T0EAdGvxi9Ty9hh+e0CgYA7D7MyrIyxXzge73CgomWnRY/YrqMjv1duj6TdbBb8gjEXXHWDeAa45VvS38E5pNG8evYzWHK62iB/712pVX+D07vFFLwJ2DVH47bPoDJOjZ0S4ApKWfps9rE0YP0sw0ArZIWPt8FD5gjS5l7sYpia9XWpwrxGRu0qjYxALp9YrQ==";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String notify_url = "http://114.55.94.1:8080/farm-0.0.1-SNAPSHOT/alipay/notifyUrl";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String return_url = "http://114.55.94.1:8080/farm-0.0.1-SNAPSHOT/alipay/returnUrl";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 支付宝网关（注意沙箱alipaydev，正式则为 alipay）
    public static String url = "https://openapi.alipaydev.com/gateway.do";

    public static String charset = "UTF-8";

    public static String format = "json";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 公钥（填自己的，下面都是改过的~）
    public static String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmxWY84ghJ8a0JQhCa/Oh5qcyK0lNHM9da1FehT+lvb8HpY4sTjgvcEF0ll+ELFrYCgrgCxZsbDmw81jml3OZB78UUKoUa/McaRwdkQYbMpn+Xb499pTJ7zP+Cx7GVC4RuNYnKp9wl2ZL2w02LAG7fsEikXw3rg5yCPSZr8gA1rG6R2mgKzLc0o0U/1XGPQckMbKs0j+lpy8NDNgnJwOXRHIA9RfCWEItmmwb2TBEGP1Yb7cmK4XavhxaBeTFmCJuKPlVUPz1NuvocbiZDfVielfvuq08bCwwqO4jCW22LaQAhVKoujOBGNdC0ZLcOa5NujiougMNrjBuK8PxIjJhOQIDAQAB";

    public static String signtype = "RSA2";

}

