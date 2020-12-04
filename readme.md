
# Cluster WebApp

  

## Backend - (Java Spring & Mysql)

  

### API CALL 1

**Method:** POST

**Path:** /kmorms-cms/cms/request

**ResponseStatus:** 200

**Payload:**
 
    {
        "body":"value"
    }

**Response:**

    {
        "id": "sdfsrw3434",
        "body": "value",
        "status": "",
        "detail": "",
        "callback": "/callback/sdfsrw3434"
    }

  

### API CALL 2

**Method:** POST

**Path:** /kmorms-cms/cms/callback/sdfsrw3434

**Payload:** null

**ResponseStatus:** 204

**Response:**

    {
        "id": "sdfsrw3434",
        "body": "value",
        "status": "Started",
        "detail": "",
        "callback": "/callback/sdfsrw3434"
    }

### API CALL 3

**Method:** PUT

**Path:** /kmorms-cms/cms/callback/sdfsrw3434

**Payload:** null

**ResponseStatus:** 204

**Response:**

    {
        "id": "sdfsrw3434",
        "body": "value",
        "status": "Processed",
        "detail": "",
        "callback": "/callback/sdfsrw3434"
    }

### API CALL 4

**Method:** GET

**Path:** /kmorms-cms/cms/callback/sdfsrw3434

**Payload:** null

**ResponseStatus:** 200

**Response:**

    {
        "id": "sdfsrw3434",
        "body": "value",
        "status": "Processed",
        "detail": "",
        "callback": "/callback/sdfsrw3434"
    }

  
> Note:
>  1. All API runs one by one simultaneously
>  2. All request other than GET is having content-type : application/json
