<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: macnaer
  Date: 16.07.2020
  Time: 09:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="templates/header.jsp"%>
<div class="container">
    <div class="row">
        <div class="col">
            <h1>Add Product</h1>
            <div class="contact-form-right">
                <h2>GET IN TOUCH</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed odio justo, ultrices ac nisl sed, lobortis porta elit. Fusce in metus ac ex venenatis ultricies at cursus mauris.</p>
                <form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" commandName="product" enctype="multipart/form-data">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="name">Product name</label>
                                <form:input path="productName" type="text"  class="form-control" id="name"  placeholder="Product Name" required="required" data-error="Please enter your name" />
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="category">Category</label>
                                <form:input path="productCategory" type="text" placeholder="Product category" id="category" class="form-control" required="required" data-error="Please enter your email" />
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="description">Description</label>
                                <form:textarea path="productDescription" id="description" class="form=control" rows="4" />
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="price">Price</label>
                                <form:input path="productPrice" type="text" placeholder="Price" id="price" class="form-control" required="required" data-error="Please enter your email" />
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="price">Condition</label>
                                <label><form:radiobutton path="productCondition" value="New"   id="condition" class="form-control"  />New</label>
                                <label><form:radiobutton path="productCondition" value="used"   id="condition" class="form-control"  />Used</label>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="status">Status</label>
                                <label><form:radiobutton path="productStatus" value="New"   id="status" class="form-control"  />Active</label>
                                <label><form:radiobutton path="productStatus" value="used"   id="status" class="form-control"  />InActive</label>
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="form-group">
                                <label for="manufacturer">Manufacturer</label>
                                <form:input path="productManufacturer" type="text" placeholder="Manufacturer" id="manufacturer" class="form-control" required="required" data-error="Please enter your email" />
                                <div class="help-block with-errors"></div>
                            </div>
                            <div class="form-group">
                                <label for="image">Upload Image</label>
                                <form:input path="productImage" type="file" placeholder="Upload image" id="image" class="form-control" />
                                <div class="help-block with-errors"></div>
                            </div>
                        </div>
                        <div class="col-md-12">
                            <div class="submit-button text-center">
                                <input type="submit" class="btn btn-dark" value="Save product" />
<%--                                <button class="btn hvr-hover" id="submit" type="submit">Save product</button>--%>
                                <div id="msgSubmit" class="h3 text-center hidden"></div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
<%@include file="templates/footer.jsp"%>