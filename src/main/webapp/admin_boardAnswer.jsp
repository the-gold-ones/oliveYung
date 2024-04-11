<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>[Admin]board</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">
    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">
    <script>
    function changeAnswerColor() {
        document.getElementById("answerButton").style.backgroundColor = "rgb(80, 80, 80)"; 
     
    }
    function changeDeleteColor() {
        document.getElementById("deleteButton").style.backgroundColor = "rgb(80, 80, 80)"; 
     
    }

    function restoreAnswerColor() {
        document.getElementById("answerButton").style.backgroundColor = "rgb(123, 125, 125)"; 

    }
    function restoreDeleteColor() {
        document.getElementById("deleteButton").style.backgroundColor = "rgb(123, 125, 125)"; 

    }
    </script>
	<style>
	.styled-table {
		width: 100%;
	    border-collapse: collapse;
	    margin: 25px 0;
	    font-size: 0.9em;
	    font-family: sans-serif;
	    min-width: 400px;
	    box-shadow: 0 0 20px rgba(0, 0, 0, 0.3);
	}
	
	.styled-table thead tr {
    background-color: rgb(123,125,135);
 	color: #ffffff;
    text-align: left;
	}
	
	.styled-table th,
	.styled-table td {
    padding: 12px 15px;
	}
	
	.styled-table tbody tr {
    border-bottom: 1px solid #dddddd;
	}

	.styled-table tbody tr:nth-of-type(even) {
	    background-color: #f3f3f3;
	}
	
	.styled-table tbody tr:last-of-type {
	    border-bottom: 2px solid rgb(123,125,135);
	}
	
	</style>
</head>
<body id="page-top">
    <!-- Page Wrapper -->
    <div id="wrapper">
        <!-- Sidebar -->
        <ul class="navbar-nav bg-dark sidebar sidebar-dark accordion" id="accordionSidebar">
            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="admin_index.jsp">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fas fa-laugh-wink"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Admin</div>
            </a>
            <!-- Divider -->
            <hr class="sidebar-divider my-0">
            <!-- Divider -->
            <hr class="sidebar-divider">
              <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>상품 관리</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <a class="collapse-item" href="admin_itemAdd.jsp">상품 등록</a>
                        <a class="collapse-item" href="admin_itemList.jsp">상품 목록</a>
                    </div>
                </div>
            </li>
            <!-- Divider -->
            <hr class="sidebar-divider">
              <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="admin_order.jsp">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>주문 관리</span></a>
            </li>
            <!-- Divider -->
            <hr class="sidebar-divider">
              <!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="admin_member.jsp">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>회원 관리</span></a>
            </li>
            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">
			<!-- Nav Item - Dashboard -->
            <li class="nav-item">
                <a class="nav-link" href="admin_board.jsp">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>게시판 관리</span></a>
            </li>
            
             <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">
            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>
        </ul>
        <!-- End of Sidebar -->
          <!-- Begin Page Content -->
                <div class="container-fluid">
                    <div class="d-sm-flex align-items-center justify-content-between mb-4"> </div>
                   <!-- Content Row -->
                   <!-- 문의 목록 -->
                    <div class="row">
                    	<div class="col-xl-12">
                    <!-- 번호, 카테고리, 제목, 내용, 아이디, 날짜, 삭제버튼-->
							<form action="" method="post"> 
								<table class="styled-table">
								<h3>Q&A</h3>
								<tr>
									<td style="width: 150px; background-color:rgb(123,125,135); color:#ffffff;">카테고리</td>
									<td>
										<select style="width: 200px;" name="category" class="form-control" required="required">
											<option value="skin">스킨</option>
											<option value="cleansing">클렌징</option>
											<option value="makeup">메이크업</option>
											<option value="perfume">향수</option>
										</select>
									</td>
									<td style="width: 150px; background-color:rgb(123,125,135); color:#ffffff;">작성일</td>
									<td><input type="text" name="moment" class="form-control" style="width: 300px;" required="required"> </td>
								</tr>
								<tr>
									<td style="width: 150px; background-color:rgb(123,125,135); color:#ffffff;">제목</td>
									<td><input type="text" name="questionTitle" class="form-control" style="width: 300px;" required="required"> </td>
								</tr>
								<tr>
									<td style="width: 150px; background-color:rgb(123,125,135); color:#ffffff;">아이디</td>
									<td><input type="text" name="user_id" class="form-control" style="width: 300px;" required="required"> </td>
								</tr>			
								<tr>
									<td style="width: 150px; background-color:rgb(123,125,135); color:#ffffff;">내용</td>
									<td><textarea name="questionContent" class="form-control" rows="10" cols="10"></textarea></td>
									<!-- <input type="text" name="questionContent" class="form-control" style="width: 200px;" required="required">  -->
								</tr>
								<tr>
									<td style="width: 150px; background-color:rgb(123,125,135); color:#ffffff;">답변</td>
									<td><textarea name="questionContent" class="form-control" rows="10" cols="10"></textarea></td>
									<!-- <input type="text" name="questionContent" class="form-control" style="width: 200px;" required="required">  -->
								</tr>
								<!--  수정 버튼 -> 답변 완료로 나타내기 List에 -->
								<tr>
									<td colspan="4" align="center">
										<button type="submit" class="btn btn-info" id="btnadd" style="width: 100px; background-color:rgb(123,125,125); border:none;" onclick="location.href='admin_board.jsp'">확인</button>
										<button type="button" class="btn btn-info" style="width: 100px; background-color:rgb(123,125,125); border:none;" onclick="location.href='admin_board.jsp'">취소</button>
									</td>
								</tr>
								</table>
							</form>
						</div>
          	 	 	</div>
            <!-- End of Main Content -->
           <!-- Footer -->
      		<footer class="sticky-footer bg-white">
		          <div class="container my-auto">
		              <div class="copyright text-center my-auto">
		                  <span>Copyright &copy; Your Website 2021</span>
		              </div>
		          </div>
      		</footer>
      		<!-- End of Footer -->
       </div>
    
</div>
         

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>
    <!-- Page level plugins -->
    <script src="vendor/chart.js/Chart.min.js"></script>
    <!-- Page level custom scripts -->
    <script src="js/demo/chart-area-demo.js"></script>
    <script src="js/demo/chart-pie-demo.js"></script>

</body>
</html>