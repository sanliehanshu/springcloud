package com.windsun.wangs.rabbitmq;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 项目名称：springcloud
 * 类 名 称：Provider
 * 类 描 述：
 * 创建时间：2021/6/9 00:02
 * 创 建 人：wangsheng
 */
public class Provider {

    @Test
    public void testSendMessage() throws IOException, TimeoutException {
        // 创建连接mq的连接工厂对象
        ConnectionFactory connectionFactory = new ConnectionFactory();
        // 设置连接rabbitmq主机
        connectionFactory.setHost("192.168.121.128");
        // 设置端口号
        connectionFactory.setPort(5672);
        // 设置连接的虚拟主机
        connectionFactory.setVirtualHost("/ems");
        // 设置用户和密码
        connectionFactory.setUsername("ems");
        connectionFactory.setPassword("ems");

        // 获取连接对象
        Connection connection = connectionFactory.newConnection();
        // 获取连接中的通道
        Channel channel = connection.createChannel();
        // 通道去绑定对象的消息队列
        // 参数1：queue 队列名称，如果名称不存在则创建
        // 参数2：durable 用来定义队列特性是否要持久化，true 持久化队列，false 不持久化队列
        // 参数3：exclusive 是否独占队列 true 独占，false 不独占
        // 参数4：autoDelete 是否在消费完成后自动删除队列 true 自动删除，false 不自动删除
        // 参数5：argument 额外附加参数
        channel.queueDeclare("hello",false,false,false,null);
        // 发布消息
        // 参数1：交换机的名称
        // 参数2：队列名称
        // 参数3：传递消息的额外设置
        // 参数4：传递消息体
        channel.basicPublish("","hello",null,"hello rabbitmq".getBytes());
        // 关闭通道
        channel.close();
        // 关闭连接
        connection.close();
    }
}
