<%@ page import="org.apache.struts2.components.Include" %>
<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<html>
<head>
    <link href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <img src="images/logo.png">
    </div>

    <div id="title" class="container">
        <h2>销售订单管理系统</h2>
    </div>

    <div class="navbar nav-list" role="navigation">
        <div class="container">
            <div>
                <ul class="breadcrumb">
                    <li><a href="#">首页</a></li>
                </ul>
            </div>

            <div class="row">
                <div class="col-md-3">
                    <ul id="main-nav" class="nav nav-tabs nav-stacked">
                        <li class="active">
                            <a href="#welcome" data-toggle="tab">
                                <i class="glyphicon glyphicon-th-large"></i>
                                首页
                            </a>
                        </li>
                        <li>
                            <a href="#right1" data-toggle="tab">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                销售订单管理
                            </a>
                        </li>
                        <li>
                            <a href="#right2" data-toggle="tab">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                发货单管理
                            </a>
                        </li>
                        <li>
                            <a href="#right3" data-toggle="tab">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                制单界面
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                orderbase维护
                            </a>
                        </li>
                        <li>
                            <a href="#mainDataList" class="nav-header collapsed hasdown" data-toggle="collapse">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-cog"></i>
                                主数据维护
                            </a>
                            <ul id="mainDataList" class="nav nav-list collapse secondmenu" style="height: 0px;padding-left: 30px">
                                <li><a href="#customerInquiry" data-toggle="tab"><i class="glyphicon glyphicon-user"></i>客户管理</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>价格表管理</a></li>
                                <li>
                                    <a href="#discountManageList" class="nav-header collapsed hasdown" data-toggle="collapse">
                                        <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                        <i class="glyphicon glyphicon-asterisk"></i>折扣管理
                                    </a>
                                    <ul id="discountManageList" class="nav nav-list collapse thirdmenu" style="padding-left: 30px">
                                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>经常性折扣</a></li>
                                        <li><a href="#"><i class="glyphicon glyphicon-th-list"></i>一次性折扣</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-credit-card"></i>
                                系统设置
                            </a>
                        </li>

                        <li>
                            <a href="">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-user"></i>
                                用户管理
                                <%--<span class="label label-warning pull-right">5</span>--%>
                            </a>
                        </li>

                        <li>
                            <a href="">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-calendar"></i>
                                权限管理
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <span class="pull-right glyphicon glyphicon-chevron-right"></span>
                                <i class="glyphicon glyphicon-fire"></i>
                                报表管理
                            </a>
                        </li>
                    </ul>
                </div>

                <div id="right" class="tab-content col-md-9">
                    <div class="tab-pane active" id="welcome">
                        <h2>welcome</h2>
                    </div>
                    <div class="tab-pane" id="customerInquiry">
                        <%--<h2>first page</h2>--%>
                        <jsp:include page="customerInquiry.jsp" />
                    </div>
                    <div class="tab-pane" id="right2">
                        <h2>second page</h2>
                    </div>
                    <div class="tab-pane" id="right3">
                        <h2>third page</h2>
                    </div>

                </div>

            </div>

        </div>

    </div>

</body>
<script>
    $(".hasdown").click(function(){
        var obj = $(this).children("span");
        var breadcrumb = $(".breadcrumb");
        if(obj.hasClass("glyphicon-chevron-right")) {
            obj.removeClass().addClass("pull-right glyphicon glyphicon-chevron-down");
            breadcrumb.append('<li><a href="#">'+$(this).text()+'</a></li>')
        }
        else {
            obj.removeClass().addClass("pull-right glyphicon glyphicon-chevron-right");

        }

    })
</script>
</html>
