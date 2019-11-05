
// DRAWABLES EN JAVA //

// Definimos el objeto drawable.

RectShape r = new RectShape();
ShapeDrawable sd = new ShapeDrawable(r);
sd.getPaint().setColor(Color.RED);
sd.setIntrinsicWidth(100);
sd.setIntrinsicHeight(50);

//Mostramos el componente.

ImageView visor = (ImageView)findViewById(R.id.visor);
visor.setImageDrawable(sd);
