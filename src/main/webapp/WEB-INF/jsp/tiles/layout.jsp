<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- 공통변수 처리 -->
<c:set var="CONTEXT_PATH" value="${pageContext.request.contextPath}" scope="application"/>
<c:set var="RESOURCES_PATH" value="${CONTEXT_PATH}/resources" scope="application"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">
		<script type="text/javascript">
			var CONTEXT_PATH = "${CONTEXT_PATH}";
			var RESOURCES_PATH = "${RESOURCES_PATH}";
		</script>
		<title><tiles:insertAttribute name="title" /></title>
		<link href="resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
		<link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
		<link href="resources/css/sb-admin-2.min.css" rel="stylesheet">	
	</head>
  
	<body id="page-top">
		<div id="wrapper">
			<!-- Left Area -->
			<tiles:insertAttribute name="left"/>
			
			<div id="content-wrapper" class="d-flex flex-column">
				<div id="content">
					<!-- header Area -->
					<tiles:insertAttribute name="header" />
					<tiles:insertAttribute name="body" />
				</div>
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
		<a class="scroll-to-top rounded" href="#page-top" style="display: inline;">
	        <i class="fas fa-angle-up"></i>
	    </a>
	    <!-- Bootstrap core JavaScript-->
		<script src="resources/vendor/jquery/jquery.min.js"></script>
		<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
		
		<!-- Core plugin JavaScript-->
		<script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>
		
		<!-- Custom scripts for all pages-->
		<script src="resources/js/sb-admin-2.min.js"></script>
	</body>
  
</html>