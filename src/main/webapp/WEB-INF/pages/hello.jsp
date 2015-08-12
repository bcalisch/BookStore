<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
	<h1>${message}</h1>
	<c:forEach var="book" items="${books}">
		<li class="items">
			<div id="itemContainer">
				<div><img id="image" src="${book.imageName}"/></div>
				<div id="description">
					<div id="topDescriptionItem">${book.id}<%=" "%>
						<a href="/book?id=${book.id}">${book.title}</a>
							${book.publisher}<%=": "%>
							${book.yearPublished}<%=" "%>
						<div id="price">
							<%=" $"%>${book.price}
						</div>
					</div>
				</div>
			</div>
		</li>
	</c:forEach>
</body>
</html>