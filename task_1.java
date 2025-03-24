@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	assertEquals("Ождается, что 19 лет - значит взрослый",true, isAdult); // Напиши код здесь
}
