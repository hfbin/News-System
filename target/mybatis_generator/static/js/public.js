var totalRecord,currentPage;
//1、页面加载完成以后，直接去发送ajax请求,要到分页数据
/*$(function(){
    //去首页
    to_page(1);
});*/

function to_page(pn){
    $.ajax({
        url:"blogs",
        data:"pn="+pn,
        type:"GET",
        success:function(result){
            //alert(result);
            //console.log(result);
            //1、解析并显示员工数据
            build_emps_table(result);
            //2、解析并显示分页信息
            build_page_info(result);
            //3、解析显示分页条数据
            build_page_nav(result);
        }
    });
}

function build_emps_table(result){
    //清空table表格
    $("#emps_table tbody").empty();
    var emps = result.extend.pageInfo.list;
    $.each(emps,function(index,item){
        var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
        var blogsId = $("<td></td>").append(item.blogsId);
        var blogsTitle = $("<td></td>").append(item.blogsTitle);
        var filePath = $("<td></td>").append($("<img />").attr("src" , "http://localhost:8080/ssm01"+item.blogsImagePath.filePath).attr("class" , "tiale_imag"));
        var blogsType = $("<td></td>").append(item.blogsType);
        var blogsPageView = $("<td></td>").append(item.blogsPageView);
        var blogsContent = $("<td></td>").append($("<div> </div>").attr("class" , "blogsContent").append(item.blogsContent));
        /**
         <button class="">
         <span class="" aria-hidden="true"></span>
         编辑
         </button>
         */
        var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
            .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
        //为编辑按钮添加一个自定义的属性，来表示当前员工id
        editBtn.attr("edit-id",item.empId);
        var delBtn =  $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
            .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
        //为删除按钮添加一个自定义的属性来表示当前删除的员工id
        delBtn.attr("del-id",item.empId);
        var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
        //var delBtn =
        //append方法执行完成以后还是返回原来的元素
        $("<tr></tr>").append(checkBoxTd)
            .append(blogsId)
            .append(blogsTitle)
            .append(filePath)
            .append(blogsType)
            .append(blogsPageView)
            .append(blogsContent)
            .append(btnTd)
            .appendTo("#emps_table tbody");
    });
}
//解析显示分页信息
function build_page_info(result){
    $("#page_info_area").empty();
    $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
        result.extend.pageInfo.pages+"页,总"+
        result.extend.pageInfo.total+"条记录");
    totalRecord = result.extend.pageInfo.total;
    currentPage = result.extend.pageInfo.pageNum;
}
//解析显示分页条，点击分页要能去下一页....
function build_page_nav(result){
    //page_nav_area
    $("#page_nav_area").empty();
    var ul = $("<ul></ul>").addClass("pagination");

    //构建元素
    var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
    var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
    if(result.extend.pageInfo.hasPreviousPage == false){
        firstPageLi.addClass("disabled");
        prePageLi.addClass("disabled");
    }else{
        //为元素添加点击翻页的事件
        firstPageLi.click(function(){
            to_page(1);
        });
        prePageLi.click(function(){
            to_page(result.extend.pageInfo.pageNum -1);
        });
    }



    var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
    var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
    if(result.extend.pageInfo.hasNextPage == false){
        nextPageLi.addClass("disabled");
        lastPageLi.addClass("disabled");
    }else{
        nextPageLi.click(function(){
            to_page(result.extend.pageInfo.pageNum +1);
        });
        lastPageLi.click(function(){
            to_page(result.extend.pageInfo.pages);
        });
    }



    //添加首页和前一页 的提示
    ul.append(firstPageLi).append(prePageLi);
    //1,2，3遍历给ul中添加页码提示
    $.each(result.extend.pageInfo.navigatepageNums,function(index,item){

        var numLi = $("<li></li>").append($("<a></a>").append(item));
        if(result.extend.pageInfo.pageNum == item){
            numLi.addClass("active");
        }
        numLi.click(function(){
            to_page(item);
        });
        ul.append(numLi);
    });
    //添加下一页和末页 的提示
    ul.append(nextPageLi).append(lastPageLi);

    //把ul加入到nav
    var navEle = $("<nav></nav>").append(ul);
    navEle.appendTo("#page_nav_area");
}