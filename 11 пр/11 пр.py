import requests
import json
from pprint import pprint
def c(url):
    user_data = requests.get(url).json()
    d={}
    c=['company', 'created_at', 'email', 'id', 'name', 'url']
    for i in user_data:
        if i in c:
           d[i]=user_data[i]
    with open('output.json', 'w') as file:
        json.dump(d, file)
url1 = f"https://api.github.com/repos/MicrosoftDocs/azure-docs"
c(url1)