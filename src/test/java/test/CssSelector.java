package test;

import org.openqa.selenium.By;

public class CssSelector {
    private void cssSelector() {

        By isSelector = By.cssSelector(".radio"); // поиск по классу
        By isSelector1 = By.className("radio");  // поиск по названию класса

        By isSelector2 = By.cssSelector("#suite_mode_single"); // поиск по id
        By isSelector3 = By.id("suite_mode_single");  // поиск по id

        By tagSelector = By.cssSelector("label"); // поиск по tag
        By tagSelector1 = By.tagName("label");  // поиск по tag

        By tagAtributeSelector = By.cssSelector("label[for='name']"); // поиск по tag и атрибуту со значением
        By tagAtributeSelector1 = By.cssSelector("label[for]"); // поиск по tag и атрибуту

        By multipleClassSelector = By.cssSelector(".column.overflow-content"); // поиск по двум классам в элементе

        By simpleHierarchicalClassSelector = By.cssSelector(".table .content-inner"); // поиск простого дочернего элемента

        By fullHierarchicalClassSelector = By.cssSelector("body .table .content-inner"); // поиск многоуровнего (3-х уровнего) дочернего элемента

        By searchLikeContainsSelector = By.cssSelector("form[action*='admin']"); // поиск с вхождением подстроки в значени атрибута

        By searchLikeContainsSelector1 = By.cssSelector("form[action~='admin']"); // поиск с вхождением строки в значени атрибута

        By valueStartFromSelector = By.cssSelector("a[href^='https://']"); // поиск элемента с атрибутом, значение которого начинается с ...

        By valueEndWithFromSelector = By.cssSelector("a[href$='@gmail.com']"); // поиск элемента с атрибутом, значение которого закачинается на ...

        By chaildAfteParendSelector = By.cssSelector("ul>li"); // поиск дочернего сразу за родителем (на первом уровне)

        By chaildAfteParendSelector1 = By.cssSelector("ul>li a"); // поиск дочернего сразу за родителем, а элемент где-то в дочернем

        By chaildAfteParendSelector2 = By.cssSelector("ul>li a"); // поиск дочернего сразу за родителем, а элемент где-то в дочернем

        By elementRightAfterElementSelector = By.cssSelector("#form+script"); // поиск элемента script, который идет сразу после элемента form

        By elementOnTheSameLavelSelector = By.cssSelector("#form~script"); // поиск элемента script, которым предшествует элемент form

        By elementFirstChildSelector = By.cssSelector("li:first-child"); // поиск элемента 1-ого дочернего элемента с начала

        By elementLastChildSelector = By.cssSelector("li:last-child"); // поиск элемента 1-ого дочернего элемента с конца

        By elementNFromFirstChildSelector = By.cssSelector("li:nth-child(3)"); // поиск элемента N-ого дочернего элемента с начала

        By elementNFromLastChildSelector = By.cssSelector("li:nth-last-child(3)"); // поиск элемента N-ого дочернего элемента с конца

    }

}
