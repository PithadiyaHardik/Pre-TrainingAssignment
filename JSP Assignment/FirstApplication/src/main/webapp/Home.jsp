
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"crossorigin="anonymous"/>
<link rel="stylesheet" href="style.css" />
<title>Home Page</title>
</head>
<body onload="startScrolling()">

<% response.setHeader("Cache-Control","no-cache, no-store, must-revalidate"); %>
<% if(session.getAttribute("username")==null)
		{
			response.sendRedirect("Login.jsp");
		}
		%>
<header>
      <nav
        class="navbar navbar-expand-lg bg-body-tertiary"
        data-bs-theme="dark"
        style="width:100%"
      >
        <div class="container-fluid">
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarTogglerDemo01"
            aria-controls="navbarTogglerDemo01"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
              <img src="logo.webp" style="  display: inline;height: 60px;width: 60px;margin-right: 20px;"/>
          </div>
        </div>
        <form method="post" action="LogoutServlet">
        <button class="btn btn-outline-danger m-2">
              Logout
            </button>
        </form>
          
      </nav>
    </header>
    <main>
      <section class="carousel" id="home">
        <button class="carousel-button-prev" onclick="prevousSlide()">
          &#x21e6;
        </button>
        <button class="carousel-button-next" onclick="nextSlide()">
          &#x21e8;
        </button>
        <ul carousel-slides>
          <li><img class="carousel-slide" active-slide src="pizza1.webp" /></li>
          <li><img class="carousel-slide" src="pizza2.webp" /></li>
          <li><img class="carousel-slide" src="pizza3.webp" /></li>
          <li><img class="carousel-slide" src="pizza4.webp" /></li>
        </ul>
      </section>
      <hr />
      <section class="menu" id="menu-section">
        <section class="menu-left">
          Our Menu
        </section>
        <section>
          <section class="pizza-menu">
            <h3 class="menu-header">Pizzas availables:</h3>
            <section class="pizza-menu-columns">
              <div>
                <div class="pizza-menu-item">
                  <p>Name</p>
                  <p>S</p>
                  <p>M</p>
                  <p>L</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Fresh veggie</p>
                  <p>100rs.</p>
                  <p>130rs.</p>
                  <p>180rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Vegitarian Bite</p>
                  <p>120rs.</p>
                  <p>150rs.</p>
                  <p>200rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Peppy Panner</p>
                  <p>170rs.</p>
                  <p>200rs.</p>
                  <p>240rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Cheese burst</p>
                  <p>200rs.</p>
                  <p>240rs.</p>
                  <p>400rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Mushroom Bite</p>
                  <p>300rs.</p>
                  <p>400rs.</p>
                  <p>500rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Chatpata Paneer</p>
                  <p>300rs.</p>
                  <p>370rs.</p>
                  <p>450rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>American Heat</p>
                  <p>320rs.</p>
                  <p>400rs.</p>
                  <p>480rs.</p>
                </div>
              </div>
              <div>
                <div class="pizza-menu-item">
                  <p>Name</p>
                  <p>S</p>
                  <p>M</p>
                  <p>L</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Maxican Fashion</p>
                  <p>400rs.</p>
                  <p>490rs.</p>
                  <p>580rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Haven Spirit</p>
                  <p>450rs.</p>
                  <p>530rs.</p>
                  <p>600rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Four Seasons Special</p>
                  <p>450rs.</p>
                  <p>530rs.</p>
                  <p>600rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>classic Chicken Pizza</p>
                  <p>450rs.</p>
                  <p>530rs.</p>
                  <p>620rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Meat lover Pizza</p>
                  <p>500rs.</p>
                  <p>600rs.</p>
                  <p>700rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Gamberi Pizza</p>
                  <p>540rs.</p>
                  <p>640rs.</p>
                  <p>750rs.</p>
                </div>
                <div class="pizza-menu-item">
                  <p>Chicken Dominator</p>
                  <p>600rs.</p>
                  <p>720rs.</p>
                  <p>900rs.</p>
                </div>
              </div>
            </section>
          </section>
        </section>
      </section>
      <hr />
      <section class="aboutus" id="aboutus-section">
        <h3 class="aboutus-header">About Us</h3>
        <div class="aboutus-text">
          Joey's Pizza is all about quality you can trust. As one of the
          original founding Pizza brands and the 3rd largest Pizza chain in
          India, our sole mission is making the freshest, tastiest and funnest
          Pizza around.
        </div>
        <div class="aboutus-text">
          Our classic pan pizza will always be a fan favourite, with a soft and
          chewy crust perfectly balancing out the healthy tomato pure and
          mozzarella - cheddar blended cheese. Our authentic Italian crust for
          those who would prefer a light and airy crust to more fully enjoy the
          toppings. Thin, light and delicious. Our newest addition of Puree.
        </div>
        <div class="aboutus-text">
          sauces will blow your mind. Chose between a spicy buffalo, sweet bbq,
          tangy chipotle can creamy makhni to perfectly compliment your toppings
          and crust. Our suggestions of combinations might be helpful but
          ultimately the power lies with you. Contrary to industry standard
          strategy, Joey's Pizza, since 1996, has been committed to growing our
          brand slowly and steadily. Every outlet is carefully selected on
          strict criteria. To be a Joey's Pizza franchisee is a privilege unto
          itself. The same commitment to product and service perfection we
          practice is expected from our partners.
        </div>
        <div class="aboutus-text">
          Our outlets designed by leading architects to reflect our philosophy
          of being open and inviting, while putting our customer comfort on
          priority. Everywhere we go, we hear ‘Your pizza is the tastiest pizza
          around, why aren’t you open in my location’. The answer is simple,
          every outlet opened is a promise to our customer, and not one we take
          lightly.
        </div>
      </section>
      <hr />
      <h3 class="contactus-header">Contact Us</h3>
      <section class="contactus" id="contactus-section">
        <div class="contactus-item">
          <h3 class="contactus-item-header">Our Locations:</h3>
          <p>
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="16"
              height="16"
              fill="currentColor"
              class="bi bi-geo-alt-fill"
              viewBox="0 0 16 16"
            >
              <path
                d="M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z"
              />
            </svg>
            Shop no A22, SVM road,malad west, malad(west), mumbai 400067
          </p>
          <p>
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="16"
              height="16"
              fill="currentColor"
              class="bi bi-geo-alt-fill"
              viewBox="0 0 16 16"
            >
              <path
                d="M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z"
              />
            </svg>
            Shop no B4, Tanaji Nagar road,malad east, malad(west), mumbai 400097
          </p>
          <p>
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="16"
              height="16"
              fill="currentColor"
              class="bi bi-geo-alt-fill"
              viewBox="0 0 16 16"
            >
              <path
                d="M8 16s6-5.686 6-10A6 6 0 0 0 2 6c0 4.314 6 10 6 10zm0-7a3 3 0 1 1 0-6 3 3 0 0 1 0 6z"
              />
            </svg>
            Shop no C21, kurar village,malad east, malad(west), mumbai 400097
          </p>
        </div>
        <div class="contactus-item">
          <h3 class="contactus-item-header">Contact details:</h3>
          <p>
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="16"
              height="16"
              fill="currentColor"
              class="bi bi-telephone-fill"
              viewBox="0 0 16 16"
            >
              <path
                fill-rule="evenodd"
                d="M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z"
              />
            </svg>
            &nbsp;1234567890
          </p>
          <p>
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="16"
              height="16"
              fill="currentColor"
              class="bi bi-envelope-at-fill"
              viewBox="0 0 16 16"
            >
              <path
                d="M2 2A2 2 0 0 0 .05 3.555L8 8.414l7.95-4.859A2 2 0 0 0 14 2H2Zm-2 9.8V4.698l5.803 3.546L0 11.801Zm6.761-2.97-6.57 4.026A2 2 0 0 0 2 14h6.256A4.493 4.493 0 0 1 8 12.5a4.49 4.49 0 0 1 1.606-3.446l-.367-.225L8 9.586l-1.239-.757ZM16 9.671V4.697l-5.803 3.546.338.208A4.482 4.482 0 0 1 12.5 8c1.414 0 2.675.652 3.5 1.671Z"
              />
              <path
                d="M15.834 12.244c0 1.168-.577 2.025-1.587 2.025-.503 0-1.002-.228-1.12-.648h-.043c-.118.416-.543.643-1.015.643-.77 0-1.259-.542-1.259-1.434v-.529c0-.844.481-1.4 1.26-1.4.585 0 .87.333.953.63h.03v-.568h.905v2.19c0 .272.18.42.411.42.315 0 .639-.415.639-1.39v-.118c0-1.277-.95-2.326-2.484-2.326h-.04c-1.582 0-2.64 1.067-2.64 2.724v.157c0 1.867 1.237 2.654 2.57 2.654h.045c.507 0 .935-.07 1.18-.18v.731c-.219.1-.643.175-1.237.175h-.044C10.438 16 9 14.82 9 12.646v-.214C9 10.36 10.421 9 12.485 9h.035c2.12 0 3.314 1.43 3.314 3.034v.21Zm-4.04.21v.227c0 .586.227.8.581.8.31 0 .564-.17.564-.743v-.367c0-.516-.275-.708-.572-.708-.346 0-.573.245-.573.791Z"
              />
            </svg>
            &nbsp;joeyspizza@gmail.com
          </p>
        </div>
      </section>
    </main>
  </body>

  <script src="script.js"></script>
</html>