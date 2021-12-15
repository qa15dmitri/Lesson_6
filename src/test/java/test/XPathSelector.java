package test;

public class XPathSelector {
private static String absolutePath = "/html/body/div";

    //Все элементы на страниценачиная с html - тега
    private static String allElementsInHtmlPath = "//*";
    //элемент по тегу
    private static String bidyPath = "//body";
    //дочерний элемент (первый) в теге  "form"
    private static String childPath = "//form/input";
    //поиск элемента с атрибутом и его значением
    private static String tadWithAttributPath = "//span[@id='accsess--1']";
    //поиск родителя у элемента с атрибутом и его значением
    private static String parentPath = "//span[@id='accsess--1']/..";
    //элемент по индексу (в ()-х мы получаем массив элементов, в []- порядковый элемент в этом массиве
    private static String elmentByIndexPath = "(//form)[4]";
    //поиск элемента по тексту - полному соответствию
    private static String searchByTextPath = "//*[.='New Widjet']"; // "//*[text()='New Widjet']";
    //поиск элемента по частичному содержанию текста
    private static String searchBySubstringPath = "//*[contains(text(),'Widjet']";
    // поиск элемента по атрибуту, значение которого начинается с ...
    private static String searchByStartsWithPath = "//input[starts-with(@type,'Widjet']";

    // логические операторы "and" и "or"
    //использование логических операторов
    private static String searchByTwoAtributPath = "//*[class=\"form-control \" and @type='Widjet']";
    private static String searchByTwoAtribut1Path = "//*[class='form-control ' and @type='Widjet']";
    private static String searchBySpecificAtributPath = "//input @type!='Widjet']"; //не равно

    // оси
    // ancestor - все предки для текущеко узла (местоположения)
    private static String path1 = "//*[@id='suite_mode_single_baseline']/ancestor::div";
    //  - все потомки (дети) для текущего узла

    //ul/child::span
    private static String path2_1 = "//ul/child::li";
    //ul/child::li
    private static String path2_2 = "//ul/li";

    // descendant:: - все предки
    // parent - ось
    //child - ось

    // following - разрезает html на 2 части (верх/низ) не зависимо от уровня,

    // following-sibling -

    // preceding -
    // preceding-sibling -

    // движение вверх/вниз
}
