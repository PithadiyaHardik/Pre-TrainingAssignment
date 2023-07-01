const nextSlide = () => {
  let currentSlide = document.querySelector("img[active-slide]").parentElement;
  let slides = document.querySelector("ul[carousel-slides]").children;
  let currentIndex = [...slides].indexOf(currentSlide);
  let nextSlide = slides[(currentIndex + 1) % slides.length];
  currentSlide.children[0].removeAttribute("active-slide");
  nextSlide.children[0].setAttribute("active-slide", "true");
};

const prevousSlide = () => {
  let currentSlide = document.querySelector("img[active-slide]").parentElement;
  let slides = document.querySelector("ul[carousel-slides]").children;
  let currentIndex = [...slides].indexOf(currentSlide);
  console.log(currentIndex);
  let prevSlide =
    slides[currentIndex - 1 == -1 ? slides.length - 1 : currentIndex - 1];
  currentSlide.children[0].removeAttribute("active-slide");
  prevSlide.children[0].setAttribute("active-slide", "true");
  console.log("completed");
};

const startScrolling = () => {
  setInterval(nextSlide, 5000);
};
