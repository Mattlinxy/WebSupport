<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<html>
<body>
<h2>简易后台参数管理器:</h2>
<table  border="1">
    <tr>
        <th>命令名称</th>
        <th>说明</th>
        <th>参数名</th>
        <th>参数类型</th>
        <th>参数说明</th>
        <th>返回类型</th>
    </tr>
    <tr>
        <td>getData.do</td>
        <td>获取后台数据所有数据</td>
        <td>无</td>
        <td>无</td>
        <td>无</td>
        <td>Object</td>
    </tr>
    <tr>
        <td>get.do</td>
        <td>通过key获取后台数据</td>
        <td>key</td>
        <td>String</td>
        <td>变量名字</td>
        <td>Object</td>
    </tr>
    <tr>
        <td>put.do</td>
        <td>将变量放入后台</td>
        <td>key,value</td>
        <td>String,Object</td>
        <td>变量名字,对象值</td>
        <td>false/true</td>
    </tr>
    <tr>
        <td>getKey.do</td>
        <td>获取后台所有变量名</td>
        <td>无</td>
        <td>无</td>
        <td>无</td>
        <td>String[]</td>
    </tr>
    <tr>
        <td>clearData.do</td>
        <td>清理后台变量</td>
        <td>无</td>
        <td>无</td>
        <td>无</td>
        <td>true</td>
    </tr>
</table>
</body>
</html>
