<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/title.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/content.css">
<title>** Gyojin's Profile **</title>
</head>
<body>
	<%@ include file="include/header.jsp" %>
	<center>
	<table width="75%" border="0" cellspacing="0" cellpadding="20">
		<tr>
			<td class="titlebox">
				<span class="title01">DEVELOPER GYOJIN'S PROFILE</span>
			</td>
		</tr>
		<tr>
			<td class="titlebox">
				<span class="title02">I'm Gyojin Lee, a developer who wants a development job. Please call me back.</span>
			</td>
		</tr>
		<tr>
			<td>
				<center>
				<table width="80%" border="0" cellspacing="0" cellpadding="10">
					<tr class="contentbox">
						<td class="content">
							<br><br>
							<center>
							<table width="80%" border="1" cellspacing="0" cellpadding="10">
								<tr>
									<th class="board_title">번호</th>
									<th class="board_title">아이디</th>
									<th class="board_title" width="50%">질문내용</th>
									<th class="board_title">글쓴이</th>
									<th class="board_title">등록일</th>
								</tr>	
								<tr>
									<td class="board_content">10</td>
									<td class="board_content">tiger</td>
									<td class="board_content">질문드립니다.안녕하세요.</td>
									<td class="board_content">홍길동</td>
									<td class="board_content">2022-11-25 02:34</td>
								</tr>						
								<tr>
									<td class="board_content">11</td>
									<td class="board_content">tiger</td>
									<td class="board_content">질문드립니다.안녕하세요.</td>
									<td class="board_content">홍길동</td>
									<td class="board_content">2022-11-25 02:34</td>
								</tr>
								<tr>
									<td class="board_content">12</td>
									<td class="board_content">tiger</td>
									<td class="board_content">질문드립니다.안녕하세요.</td>
									<td class="board_content">홍길동</td>
									<td class="board_content">2022-11-25 02:34</td>
								</tr>
								<tr>
									<td colspan="5" align="right">
										<input type="button" value="질문하기" class="button_type01" onclick="script:window.location='question'">
									</td>
								</tr>
								
							</table>
							</center>
							<br>						
						</td>						
					</tr>
					
				</table>
				</center>			
			</td>
		</tr>
	</table>
	</center>
	<%@ include file="include/footer.jsp" %>
</body>
</html>