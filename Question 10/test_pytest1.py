import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By

@pytest.fixture
def initiate_browser():

    driver = webdriver.Chrome()
    driver.get("https://www.w3schools.com/")
    yield driver
    driver.quit()

def test_logo(initiate_browser):

    w3_logo = initiate_browser.find_element(By.ID, "w3-logo")
    assert w3_logo.is_displayed()

