<%--
  Created by IntelliJ IDEA.
  User: macnaer
  Date: 09.07.2020
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@include file="templates/header.jsp"%>
<%@include file="templates/internal-banner.jsp"%>
<!-- Start Shop Page  -->
<div class="shop-box-inner">
    <div class="container">
        <div class="row">
            <div class="col-xl-3 col-lg-3 col-sm-12 col-xs-12 sidebar-shop-left">
                <div class="product-categori">
                    <div class="search-product">
                        <form action="#">
                            <input class="form-control" placeholder="Search here..." type="text">
                            <button type="submit"> <i class="fa fa-search"></i> </button>
                        </form>
                    </div>
                    <div class="filter-sidebar-left">
                        <div class="title-left">
                            <h3>Categories</h3>
                        </div>
                        <div class="list-group list-group-collapse list-group-sm list-group-tree" id="list-group-men" data-children=".sub-men">
                            <div class="list-group-collapse sub-men">
                                <a class="list-group-item list-group-item-action" href="#sub-men1" data-toggle="collapse" aria-expanded="true" aria-controls="sub-men1">Clothing <small class="text-muted">(100)</small>
                                </a>
                                <div class="collapse show" id="sub-men1" data-parent="#list-group-men">
                                    <div class="list-group">
                                        <a href="#" class="list-group-item list-group-item-action active">T-Shirts <small class="text-muted">(50)</small></a>
                                        <a href="#" class="list-group-item list-group-item-action">Polo T-Shirts <small class="text-muted">(10)</small></a>
                                        <a href="#" class="list-group-item list-group-item-action">Round Neck T-Shirts <small class="text-muted">(10)</small></a>
                                        <a href="#" class="list-group-item list-group-item-action">V Neck T-Shirts <small class="text-muted">(10)</small></a>
                                        <a href="#" class="list-group-item list-group-item-action">Hooded T-Shirts <small class="text-muted">(20)</small></a>
                                    </div>
                                </div>
                            </div>
                            <div class="list-group-collapse sub-men">
                                <a class="list-group-item list-group-item-action" href="#sub-men2" data-toggle="collapse" aria-expanded="false" aria-controls="sub-men2">Footwear
                                    <small class="text-muted">(50)</small>
                                </a>
                                <div class="collapse" id="sub-men2" data-parent="#list-group-men">
                                    <div class="list-group">
                                        <a href="#" class="list-group-item list-group-item-action">Sports Shoes <small class="text-muted">(10)</small></a>
                                        <a href="#" class="list-group-item list-group-item-action">Sneakers <small class="text-muted">(20)</small></a>
                                        <a href="#" class="list-group-item list-group-item-action">Formal Shoes <small class="text-muted">(20)</small></a>
                                    </div>
                                </div>
                            </div>
                            <a href="#" class="list-group-item list-group-item-action"> Men  <small class="text-muted">(150) </small></a>
                            <a href="#" class="list-group-item list-group-item-action">Accessories <small class="text-muted">(11)</small></a>
                            <a href="#" class="list-group-item list-group-item-action">Bags <small class="text-muted">(22)</small></a>
                        </div>
                    </div>
                    <div class="filter-price-left">
                        <div class="title-left">
                            <h3>Price</h3>
                        </div>
                        <div class="price-box-slider">
                            <div id="slider-range"></div>
                            <p>
                                <input type="text" id="amount" readonly style="border:0; color:#fbb714; font-weight:bold;">
                                <button class="btn hvr-hover" type="submit">Filter</button>
                            </p>
                        </div>
                    </div>
                    <div class="filter-brand-left">
                        <div class="title-left">
                            <h3>Brand</h3>
                        </div>
                        <div class="brand-box">
                            <ul>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios1" value="Yes" type="radio">
                                        <label for="Radios1"> Supreme </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios2" value="No" type="radio">
                                        <label for="Radios2"> A Bathing Ape </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios3" value="declater" type="radio">
                                        <label for="Radios3"> The Hundreds </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios4" value="declater" type="radio">
                                        <label for="Radios4"> Alife </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios5" value="declater" type="radio">
                                        <label for="Radios5"> Neighborhood </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios6" value="declater" type="radio">
                                        <label for="Radios6"> CLOT </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios7" value="declater" type="radio">
                                        <label for="Radios7"> Acapulco Gold </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios8" value="declater" type="radio">
                                        <label for="Radios8"> UNDFTD </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios9" value="declater" type="radio">
                                        <label for="Radios9"> Mighty Healthy </label>
                                    </div>
                                </li>
                                <li>
                                    <div class="radio radio-danger">
                                        <input name="survey" id="Radios10" value="declater" type="radio">
                                        <label for="Radios10"> Fiberops </label>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>
            <div class="col-xl-9 col-lg-9 col-sm-12 col-xs-12 shop-content-right">
                <div class="right-product-box">
                    <div class="product-item-filter row">
                        <div class="col-12 col-sm-8 text-center text-sm-left">
                            <div class="toolbar-sorter-right">
                                <span>Sort by </span>
                                <select id="basic" class="selectpicker show-tick form-control" data-placeholder="$ USD">
                                    <option data-display="Select">Nothing</option>
                                    <option value="1">Popularity</option>
                                    <option value="2">High Price → High Price</option>
                                    <option value="3">Low Price → High Price</option>
                                    <option value="4">Best Selling</option>
                                </select>
                            </div>
                            <p>Showing all 4 results</p>
                        </div>
                        <div class="col-12 col-sm-4 text-center text-sm-right">
                            <ul class="nav nav-tabs ml-auto">
                                <li>
                                    <a class="nav-link active" href="#grid-view" data-toggle="tab"> <i class="fa fa-th"></i> </a>
                                </li>
                                <li>
                                    <a class="nav-link" href="#list-view" data-toggle="tab"> <i class="fa fa-list-ul"></i> </a>
                                </li>
                            </ul>
                        </div>
                    </div>

                    <div class="row product-categorie-box">
                        <div class="tab-content">
                            <div role="tabpanel" class="tab-pane fade show active" id="grid-view">
                                <div class="row">
                                    <div class="col-sm-6 col-md-6 col-lg-4 col-xl-4">
                                        <c:forEach items="${products}" var="product">
                                        <div class="products-single fix">
                                            <div class="box-img-hover">
                                                <div class="type-lb">
                                                    <p class="sale">${product.productCondition}</p>
                                                </div>
                                                <img src="<c:url value="/resources/images/img-pro-01.jpg"/>" class="img-fluid" alt="Image">
                                                <div class="mask-icon">
                                                    <ul>
                                                        <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>
                                                        <li><a href="#" data-toggle="tooltip" data-placement="right" title="Compare"><i class="fas fa-sync-alt"></i></a></li>
                                                        <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                                                    </ul>
                                                    <a class="cart" href="#">Add to Cart</a>
                                                </div>
                                            </div>
                                            <div class="why-text">
                                                <h4>Lorem ipsum dolor sit amet</h4>
                                                <h5> $9.79</h5>
                                            </div>
                                        </div>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                            <div role="tabpanel" class="tab-pane fade" id="list-view">
                                <div class="list-view-box">
                                    <div class="row">
                                        <div class="col-sm-6 col-md-6 col-lg-4 col-xl-4">
                                            <div class="products-single fix">
                                                <div class="box-img-hover">
                                                    <div class="type-lb">
                                                        <p class="new">New</p>
                                                    </div>
                                                    <img src="<c:url value="/resources/images/img-pro-01.jpg"/>" class="img-fluid" alt="Image">
                                                    <div class="mask-icon">
                                                        <ul>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Compare"><i class="fas fa-sync-alt"></i></a></li>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                                                        </ul>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 col-md-6 col-lg-8 col-xl-8">
                                            <div class="why-text full-width">
                                                <h4>Lorem ipsum dolor sit amet</h4>
                                                <h5> <del>$ 60.00</del> $40.79</h5>
                                                <p>Integer tincidunt aliquet nibh vitae dictum. In turpis sapien, imperdiet quis magna nec, iaculis ultrices ante. Integer vitae suscipit nisi. Morbi dignissim risus sit amet orci porta, eget aliquam purus
                                                    sollicitudin. Cras eu metus felis. Sed arcu arcu, sagittis in blandit eu, imperdiet sit amet eros. Donec accumsan nisi purus, quis euismod ex volutpat in. Vestibulum eleifend eros ac lobortis aliquet.
                                                    Suspendisse at ipsum vel lacus vehicula blandit et sollicitudin quam. Praesent vulputate semper libero pulvinar consequat. Etiam ut placerat lectus.</p>
                                                <a class="btn hvr-hover" href="#">Add to Cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="list-view-box">
                                    <div class="row">
                                        <div class="col-sm-6 col-md-6 col-lg-4 col-xl-4">
                                            <div class="products-single fix">
                                                <div class="box-img-hover">
                                                    <div class="type-lb">
                                                        <p class="sale">Sale</p>
                                                    </div>
                                                    <img src="<c:url value="/resources/images/img-pro-02.jpg"/>" class="img-fluid" alt="Image">
                                                    <div class="mask-icon">
                                                        <ul>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Compare"><i class="fas fa-sync-alt"></i></a></li>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                                                        </ul>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 col-md-6 col-lg-8 col-xl-8">
                                            <div class="why-text full-width">
                                                <h4>Lorem ipsum dolor sit amet</h4>
                                                <h5> <del>$ 60.00</del> $40.79</h5>
                                                <p>Integer tincidunt aliquet nibh vitae dictum. In turpis sapien, imperdiet quis magna nec, iaculis ultrices ante. Integer vitae suscipit nisi. Morbi dignissim risus sit amet orci porta, eget aliquam purus
                                                    sollicitudin. Cras eu metus felis. Sed arcu arcu, sagittis in blandit eu, imperdiet sit amet eros. Donec accumsan nisi purus, quis euismod ex volutpat in. Vestibulum eleifend eros ac lobortis aliquet.
                                                    Suspendisse at ipsum vel lacus vehicula blandit et sollicitudin quam. Praesent vulputate semper libero pulvinar consequat. Etiam ut placerat lectus.</p>
                                                <a class="btn hvr-hover" href="#">Add to Cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="list-view-box">
                                    <div class="row">
                                        <div class="col-sm-6 col-md-6 col-lg-4 col-xl-4">
                                            <div class="products-single fix">
                                                <div class="box-img-hover">
                                                    <div class="type-lb">
                                                        <p class="sale">Sale</p>
                                                    </div>
                                                    <img src="<c:url value="/resources/images/img-pro-03.jpg"/>" class="img-fluid" alt="Image">
                                                    <div class="mask-icon">
                                                        <ul>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Compare"><i class="fas fa-sync-alt"></i></a></li>
                                                            <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                                                        </ul>

                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-6 col-md-6 col-lg-8 col-xl-8">
                                            <div class="why-text full-width">
                                                <h4>Lorem ipsum dolor sit amet</h4>
                                                <h5> <del>$ 60.00</del> $40.79</h5>
                                                <p>Integer tincidunt aliquet nibh vitae dictum. In turpis sapien, imperdiet quis magna nec, iaculis ultrices ante. Integer vitae suscipit nisi. Morbi dignissim risus sit amet orci porta, eget aliquam purus
                                                    sollicitudin. Cras eu metus felis. Sed arcu arcu, sagittis in blandit eu, imperdiet sit amet eros. Donec accumsan nisi purus, quis euismod ex volutpat in. Vestibulum eleifend eros ac lobortis aliquet.
                                                    Suspendisse at ipsum vel lacus vehicula blandit et sollicitudin quam. Praesent vulputate semper libero pulvinar consequat. Etiam ut placerat lectus.</p>
                                                <a class="btn hvr-hover" href="#">Add to Cart</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Shop Page -->

<%@include file="templates/instagramFeed.jsp"%>
<%@include file="templates/footer.jsp"%>