function setup() {
  createCanvas(500,500);
  strokeWeight(3); // entire thick outline
  c = color(50, 55, 100); // Create a color for 'c'
  stroke(c);
} 

function draw() {
  background(150);
  rect(100,200,150,130); //body
  rect(130,330,25,70);   // left leg
  rect(200,330,25,70);   // right leg
  
  //left hand
  line(50,270,100,200);
  line(52,300,100,230);
  line(50,270,52,300);
  
  // right hand
  line(300,270,250,200);
  line(302,300,250,230);
  line(300,270,330,220);
  line(302,300,345,230);
  line(345,230,330,220);
  
  
  ellipse(140,400,45,22); // left foot
  ellipse(215,400,45,22); // right foot
  ellipse(140,400,35,22); // left foot
  ellipse(215,400,35,22); // right foot
  ellipse(140,400,25,22); // left foot
  ellipse(215,400,25,22); // right foot
  ellipse(140,400,25,12); // left foot
  ellipse(215,400,25,12); // right foot
  
  ellipse(51,285,25,30); // left palm
  ellipse(340,220,25,40); // right palm
  
  // antenna
  rect(172,30,7,30);
  ellipse(175,23,30,30);
  rect(120,60,100,15);
  rect(105,70,130,15);
  
  rect(160,200,28,-30);  // neck
  rect(78,80,190,90);  // head
  
  // inner body
  rect(120,220,20,80); // left
  circle(130,230,10,20); // b1
  circle(130,250,10,20); //b2
  circle(130,270,10,20); //b3
  circle(130,290,10,20); //b4
  rect(150,225,85,40);  // main
  rect(155,280,75,15); // bottom
  line(185,280,185,295); // design
  line(188,280,188,295);
  line(192,280,192,295);
  line(195,280,195,295);
  line(183,280,183,295);
  line(190,280,190,295);
  line(197,280,197,295);
  line(180,235,172,250);  // A letter
  line(180,235,185,250);  // A letter
  line(176,244,183,244);  // A letter
  line(199,235,199,250);  // I letter
  line(195,235,203,235);  // I letter
  line(195,250,203,250);  // I letter
  
  // face
  ellipse(120,120,60,60);
  ellipse(220,120,60,60);
  ellipse(120,120,60,30); // left eye
  ellipse(220,120,60,30); // right eye
  ellipse(120,120,30,30); // left eye
  ellipse(220,120,30,30); // right eye
  ellipse(120,120,25,25); // left eye
  ellipse(220,120,25,25); // right eye
  ellipse(120,120,20,20); // left eye
  ellipse(220,120,20,20); // right eye
  ellipse(120,120,15,15); // left eye
  ellipse(220,120,15,15); // right eye
  ellipse(120,120,10,10); // left eye
  ellipse(220,120,10,10); // right eye
  ellipse(120,120,5,5); // left eye
  ellipse(220,120,5,5); // right eye
   
}

// Contributed by GVP