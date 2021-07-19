function func_reset() { window.location.reload(); }

function func_gpa() {

  var credits1 = parseInt(document.getElementById("cc1").value);
  var grade1 = parseInt(document.getElementById("cg1").value);
  var course1 = credits1 * grade1;

  var credits2 = parseInt(document.getElementById("cc2").value);
  var grade2 = parseInt(document.getElementById("cg2").value);
  var course2 = credits2 * grade2;

  var credits3 = parseInt(document.getElementById("cc3").value);
  var grade3 = parseInt(document.getElementById("cg3").value);
  var course3 = credits3 * grade3;

  var credits4 = parseInt(document.getElementById("cc4").value);
  var grade4 = parseInt(document.getElementById("cg4").value);
  var course4 = credits4 * grade4;

  var credits5 = parseInt(document.getElementById("cc5").value);
  var grade5 = parseInt(document.getElementById("cg5").value);
  var course5 = credits5 * grade5;

  var credits6 = parseInt(document.getElementById("cc6").value);
  var grade6 = parseInt(document.getElementById("cg6").value);
  var course6 = credits6 * grade6;

  var credits7 = parseInt(document.getElementById("cc7").value);
  var grade7 = parseInt(document.getElementById("cg7").value);
  var course7 = credits7 * grade7;

  var credits8 = parseInt(document.getElementById("cc8").value);
  var grade8 = parseInt(document.getElementById("cg8").value);
  var course8 = credits8 * grade8;

  var ccredits1 = document.getElementById("cc1").value;
  var ccredits2 = document.getElementById("cc2").value;
  var ccredits3 = document.getElementById("cc3").value;
  var ccredits4 = document.getElementById("cc4").value;
  var ccredits5 = document.getElementById("cc5").value;
  var ccredits6 = document.getElementById("cc6").value;
  var ccredits7 = document.getElementById("cc7").value;
  var ccredits8 = document.getElementById("cc8").value;

  if (ccredits1 == '') {
    var credits1 = 0;
    var course1 = 0;
  }
  if (ccredits2 == '') {
    var credits2 = 0;
    var course2 = 0;
  }
  if (ccredits3 == '') {
    var credits3 = 0;
    var course3 = 0;
  }
  if (ccredits4 == '') {
    var credits4 = 0;
    var course4 = 0;
  }
  if (ccredits5 == '') {
    var credits5 = 0;
    var course5 = 0;
  }
  if (ccredits6 == '') {
    var credits6 = 0;
    var course6 = 0;
  }
  if (ccredits7 == '') {
    var credits7 = 0;
    var course7 = 0;
  }
  if (ccredits8 == '') {
    var credits8 = 0;
    var course8 = 0;
  }

  sumCourses = course1 + course2 + course3 + course4 + course5 + course6 + course7 + course8;
  sumCredits = credits1 + credits2 + credits3 + credits4 + credits5 + credits6 + credits7 + credits8;
  if (sumCourses == 0) {
    Swal.fire({
      icon: 'warning',
      title: 'Insufficient Data provided !!',
      text: 'Please re-enter the data..'
    });
  } else {

    /* alert("Credit 1 : " + credits1 + "\nGrade 1 : " + grade1 + "\nCourse 1 : " + course1);
    alert("Credit 2 : " + credits2 + "\nGrade 2 : " + grade2 + "\nCourse 2 : " + course2);
    alert("Credit 3 : " + credits3 + "\nGrade 3 : " + grade3 + "\nCourse 3 : " + course3);
    alert("Credit 4 : " + credits4 + "\nGrade 4 : " + grade4 + "\nCourse 4 : " + course4);
    alert("Credit 5 : " + credits5 + "\nGrade 5 : " + grade5 + "\nCourse 5 : " + course5);
    alert("Credit 6 : " + credits6 + "\nGrade 6 : " + grade6 + "\nCourse 6 : " + course6);
    alert("Credit 7 : " + credits7 + "\nGrade 7 : " + grade7 + "\nCourse 7 : " + course7);
    alert("Credit 8 : " + credits8 + "\nGrade 8 : " + grade8 + "\nCourse 8 : " + course8); */

    var mygpa = (sumCourses) / (sumCredits);
    var gpa = parseFloat(mygpa).toFixed(2);
    Swal.fire("Your GPA is : ", gpa);
  }
}

function func_cgpa() {
  //Swal.fire("Test!");
  var count = 8;

  var scredits1 = parseInt(document.getElementById("sc1").value);
  var sgpa1 = parseFloat(document.getElementById("sg1").value);
  //var sem1 = scredits1 * sgpa1;

  var scredits2 = parseInt(document.getElementById("sc2").value);
  var sgpa2 = parseFloat(document.getElementById("sg2").value);
  //var sem2 = scredits2 * sgpa2;

  var scredits3 = parseInt(document.getElementById("sc3").value);
  var sgpa3 = parseFloat(document.getElementById("sg3").value);
  // var sem3 = scredits3 * sgpa3;

  var scredits4 = parseInt(document.getElementById("sc4").value);
  var sgpa4 = parseFloat(document.getElementById("sg4").value);
  // var sem4 = scredits4 * sgpa4;

  var scredits5 = parseInt(document.getElementById("sc5").value);
  var sgpa5 = parseFloat(document.getElementById("sg5").value);
  // var sem5 = scredits5 * sgpa5;

  var scredits6 = parseInt(document.getElementById("sc6").value);
  var sgpa6 = parseFloat(document.getElementById("sg6").value);
  // var sem6 = scredits6 * sgpa6;

  var scredits7 = parseInt(document.getElementById("sc7").value);
  var sgpa7 = parseFloat(document.getElementById("sg7").value);
  // var sem7 = scredits7 * sgpa7;

  var scredits8 = parseInt(document.getElementById("sc8").value);
  var sgpa8 = parseFloat(document.getElementById("sg8").value);
  // var sem8 = scredits * sgpa8;
  // ------------------------------------------------------//

  var sscredits1 = document.getElementById("sc1").value;
  var ssgpa1 = document.getElementById("sg1").value;

  var sscredits2 = document.getElementById("sc2").value;
  var ssgpa2 = document.getElementById("sg2").value;

  var sscredits3 = document.getElementById("sc3").value;
  var ssgpa3 = document.getElementById("sg3").value;

  var sscredits4 = document.getElementById("sc4").value;
  var ssgpa4 = document.getElementById("sg4").value;

  var sscredits5 = document.getElementById("sc5").value;
  var ssgpa5 = document.getElementById("sg5").value;

  var sscredits6 = document.getElementById("sc6").value;
  var ssgpa6 = document.getElementById("sg6").value;

  var sscredits7 = document.getElementById("sc7").value;
  var ssgpa7 = document.getElementById("sg7").value;

  var sscredits8 = document.getElementById("sc8").value;
  var ssgpa8 = document.getElementById("sg8").value;


  if (sscredits1 == '' || ssgpa1 == '') {
    var scredits1 = 0;
    var sem1 = 0;
    var sgpa1 = 0;
    count = count - 1;
  }
  if (sscredits2 == '' || ssgpa2 == '') {
    var scredits2 = 0;
    var sem2 = 0;
    var sgpa2 = 0;
    count = count - 1;
  }
  if (sscredits3 == '' || ssgpa3 == '') {
    var scredits3 = 0;
    var sem3 = 0;
    var sgpa3 = 0;
    count = count - 1;
  }
  if (sscredits4 == '' || ssgpa4 == '') {
    var scredits4 = 0;
    var sem4 = 0;
    var sgpa4 = 0;
    count = count - 1;
  }
  if (sscredits5 == '' || ssgpa5 == '') {
    var scredits5 = 0;
    var sem5 = 0;
    var sgpa5 = 0;
    count = count - 1;
  }
  if (sscredits6 == '' || ssgpa6 == '') {
    var scredits6 = 0;
    var sem6 = 0;
    var sgpa6 = 0;
    count = count - 1;
  }
  if (sscredits7 == '' || ssgpa7 == '') {
    var scredits7 = 0;
    var sem7 = 0;
    var sgpa7 = 0;
    count = count - 1;
  }
  if (sscredits8 == '' || ssgpa8 == '') {
    var scredits8 = 0;
    var sem8 = 0;
    var sgpa8 = 0;
    count = count - 1;
  }

  sumSem = sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8;
  // sumTCredits = scredits1 + scredits2 + scredits3 + scredits4 + scredits5 + scredits6 + scredits7 + scredits8;

  sumGPA = sgpa1 + sgpa2 + sgpa3 + sgpa4 + sgpa5 + sgpa6 + sgpa7 + sgpa8;

  if (sumSem == 0) {
    Swal.fire({
      icon: 'warning',
      title: 'Insufficient Data provided !!',
      text: 'Please re-enter the data..'
    });
  } else {
    /* alert("count variable is - " + count);
    alert("Semester 1 : " + scredits1 + "\nSemester gpa 1 : " + sgpa1);
    alert("Semester 2 : " + scredits2 + "\nSemester gpa 2 : " + sgpa2);
    alert("Semester 3 : " + scredits3 + "\nSemester gpa 3 : " + sgpa3);
    alert("Semester 4 : " + scredits4 + "\nSemester gpa 4 : " + sgpa4);
    alert("Semester 5 : " + scredits5 + "\nSemester gpa 5 : " + sgpa5);
    alert("Semester 6 : " + scredits6 + "\nSemester gpa 6 : " + sgpa6);
    alert("Semester 7 : " + scredits7 + "\nSemester gpa 7 : " + sgpa7);
    alert("Semester 8 : " + scredits8 + "\nSemester gpa 8 : " + sgpa8); */

    var mycgpa = (sumGPA) / (count);
    var cgpa = parseFloat(mycgpa).toFixed(2);
    Swal.fire("Your CGPA is : ", cgpa);
  }
}