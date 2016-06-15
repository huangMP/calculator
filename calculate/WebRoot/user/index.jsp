<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<title>BeThinking</title>

		<!-- head-start -->
		<jsp:include page="/common/head.jsp"></jsp:include>
		<!-- head-end -->
	</head>
<body>
    <div id="wrapper">


		<!-- recommend-start -->
		<jsp:include page="/common/recommend.jsp"></jsp:include>
		<!-- recommend-end -->

		<!-- navigation top-start -->
		<jsp:include page="/common/nav-top.jsp"></jsp:include>
		<!-- navigation top-end -->




		<div id="page-wrapper">
            <div id="page-inner">

                
                
                
                
                
                
                
                
                
                

                <div class="row">
                    <div class="col-md-8">

                        <div class="panel panel-default">

                            <div id="carousel-example" class="carousel slide" data-ride="carousel" style="border: 5px solid #000;">

                                <div class="carousel-inner">
                                    <div class="item active">

                                        <img src="<%=path %>/assets/img/slideshow/1.jpg" alt="" />

                                    </div>
                                    <div class="item">
                                        <img src="<%=path %>/assets/img/slideshow/2.jpg" alt="" />

                                    </div>
                                    <div class="item">
                                        <img src="<%=path %>/assets/img/slideshow/3.jpg" alt="" />

                                    </div>
                                </div>
                                <!--INDICATORS-->
                                <ol class="carousel-indicators">
                                    <li data-target="#carousel-example" data-slide-to="0" class="active"></li>
                                    <li data-target="#carousel-example" data-slide-to="1"></li>
                                    <li data-target="#carousel-example" data-slide-to="2"></li>
                                </ol>
                                <!--PREVIUS-NEXT BUTTONS-->
                                <a class="left carousel-control" href="#carousel-example" data-slide="prev">
                                    <span class="glyphicon glyphicon-chevron-left"></span>
                                </a>
                                <a class="right carousel-control" href="#carousel-example" data-slide="next">
                                    <span class="glyphicon glyphicon-chevron-right"></span>
                                </a>
                            </div>
                        </div>


                        <div class="list-group">
                            <a href="#" class="list-group-item active">
                                <h4 class="list-group-item-heading">LIST GROUP HEADING</h4>
                                <p class="list-group-item-text" style="line-height: 30px;">
                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit.
       								Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        							Lorem ipsum dolor sit amet, consectetur adipiscing elit.
        							Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                </p>
                            </a>
                        </div>

                    </div>
                    
                    
                    

                    
                    <!-- /.REVIEWS &  SLIDESHOW  -->
                    <div class="col-md-4">

                        <div class="panel panel-default">
                            <div class="panel-heading">
                                Recent Chat History"C:/Users/huangMP/Desktop/moban1002/index.html"
                            </div>
                            <div class="panel-body" style="padding: 0px;">
                                <div class="chat-widget-main">


                                    <div class="chat-widget-left">
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                    </div>
                                    <div class="chat-widget-name-left">
                                        <h4>Amanna Seiar</h4>
                                    </div>
                                    <div class="chat-widget-right">
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                    </div>
                                    <div class="chat-widget-name-right">
                                        <h4>Donim Cruseia </h4>
                                    </div>
                                    <div class="chat-widget-left">
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                    </div>
                                    <div class="chat-widget-name-left">
                                        <h4>Amanna Seiar</h4>
                                    </div>
                                    <div class="chat-widget-right">
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                    </div>
                                    <div class="chat-widget-name-right">
                                        <h4>Donim Cruseia </h4>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-footer">
                                <div class="input-group">
                                    <input type="text" class="form-control" placeholder="Enter Message" />
                                    <span class="input-group-btn">
                                        <button class="btn btn-success" type="button">SEND</button>
                                    </span>
                                </div>
                            </div>
                        </div>




                    </div>
                    <!--/.Chat Panel End-->
                    
                    


                    

                    
                </div>
                <!-- /. ROW  -->


                <hr />
                <div class="row" style="padding-bottom: 100px; `">
                    <div class="col-md-6">
                        <div id="comments-sec">
                            <h4><strong>Compose Support Ticket </strong></h4>
                            <hr />


                            <div class="form-group  ">
                                <label>Please Write a Subject Line</label>
                                <input type="text" class="form-control" required="required" placeholder="Enter Subject Of Ticket" />
                            </div>
                            <div class="form-group ">
                                <label>Please Enter Issue</label>
                                <textarea class="form-control" rows="8"></textarea>
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-success">Compose &amp; Send Ticket</button>
                            </div>
                        </div>

                    </div>
                    <div class="col-md-6">
                        <div class="panel panel-back noti-box">
                            <span class="icon-box bg-color-black">
                                <i class="fa fa-bicycle"></i>
                            </span>
                            <div class="text-box">
                                <p class="main-text">52 Important Issues to Fix </p>
                                <p>Please fix these issues to work smooth</p>
                                <p>Time Left: 30 mins</p>
                                <hr />
                                <p>
                                    <span class=" color-bottom-txt"><i class="fa fa-edit"></i>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit gthn. 
                              Lorem ipsum dolor sit amet, consectetur adipiscing elit gthn. 
                               Lorem ipsum dolor sit amet, consectetur adipiscing elit gthn.
                             
                                    </span>


                                </p>
                                <hr />
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit gthn. 
                               Lorem ipsum dolor sit amet, consectetur adipiscing elit gthn.
                            </div>
                        </div>
                    </div>
                </div>
                <!--/.ROW-->

            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
    <!-- /. WRAPPER  -->

	<!-- footer-start -->
	<jsp:include page="/common/footer.jsp"></jsp:include>
	<!-- footer-end -->

</body>
</html>
