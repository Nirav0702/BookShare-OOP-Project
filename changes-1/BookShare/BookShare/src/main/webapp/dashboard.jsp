<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel = "stylesheet" href = "css/kkStyle.css" TYPE = "text/css">
<title>Insert title here</title>
</head>
<body>

  <div class='dashboard'>
    <div class="dashboard-nav">
        <header>
        
        
        <a href="#" class="brand-logo"><i class="fas fa-book"></i> <span>BookLender</span></a>
        
        
        </header>
        
          
        <nav class="dashboard-nav-list">
        
        <a href="#" class="dashboard-nav-item active"><i class="fas fa-tachometer-alt"></i> Dash-board </a>
        <form action="userprofile">
			<input type="hidden"  name="userName" value=${userName}>
  			<button type="submit" class= "btst"><i class="fa-solid fa-user" style="padding-right:10px; margin-left:-40px"></i> Profile </button>
		</form>
        <form action="ownedBooks">
			<input type="hidden"  name="userName" value=${userName} >
  			<button type="submit" class = "btst" ><i class="fa-solid fa-book-bookmark" style="padding-right:10px ; margin-left:-40px"></i> Owned Books</button>
		</form>
       	<form action="borrowedBooks">
			<input type="hidden"  name="userName" value=${userName}> 
  			<button class = "btst"><i class="fa-solid fa-hand-holding-medical" style="padding-right:10px ; margin-left:-40px" ></i> Borrowed Books</button>
		</form>
		<form action="borrowedBooks">
			<input type="hidden"  name="userName" value=${userName}> 
  			<button class = "btst"><i class="fa-solid fa-hand-holding-heart" style="padding-right:10px ; margin-left:-40px" ></i> Lent Books</button>
		</form>
        <form action="borrowedBooks">
			<input type="hidden"  name="userName" value=${userName}>
  			<button class = "btst"><i class="fa-solid fa-bell" style="padding-right:10px; margin-left:-40px " ></i> Notifications </button>; margin-left:-40px
		</form>
        	<form action="borrowedBooks">
			<input type="hidden"  name="userName" value=${userName}>
  			<button class = "btst"> <i class="fa-solid fa-wallet" style="padding-right:10px; margin-left:-40px" ></i> Wallet </button>
		</form>
        <div class="nav-item-divider" class = "div""></div>
        	<form action="borrowedBooks">
			<input type="hidden"  name="userName" value=${userName}>
  			<button class = "btst"><i class="fa-solid fa-right-from-bracket" style="padding-right:10px; margin-left:-40px" ></i> Logout</button>
		</form>
        </nav>
    </div>
    <div class='dashboard-app'>
        <header class='dashboard-toolbar'>
       
		 <form action="searchBook" style=" margin: auto; width: 420px;">
        <label class = "custom-field" aria-label="Enter Book">
        	<input type="text"  placeholder="Search for a Book" name="bookTitle" required id="searchBox">
        	
        	<button class="btn btn-outline-success my-2 my-sm-0" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
        	
        </label>
        </form>
       
        </header>
        <div class='dashboard-content'>
            <div class='container'>
                <div class='card'>
                    <div class='card-header'>
                        <h1>Welcome back Nirav1</h1>
                    </div>
                    <div class='card-body'>
                        <p>Your	account type is: User</p>
                    </div>
                </div>
            </div>
        </div>
      
      <div class="outer">
      	 	<form action="xyz">
			<input type="hidden" id="custId" name="userName" value=${userName}>
			<button title="Add a book!" type="submit" id = "addBookButton" ><i class="fa-solid fa-plus" style=" font-size: 50px"></i> </button>
			
		</form>
	
		 
      </div>  
        
    </div>
</div>
<script src="https://kit.fontawesome.com/bff4d844c8.js" crossorigin="anonymous"></script>

</body>
</html>