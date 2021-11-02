# TaxMan

Couldn't be bothered to pay my taxes manually and work out how much I owe, so I automated it. 

### Requirements
- MariaDB
- Basic knowledge of environment variables (Optional)

### Setup
1. Install a local MariaDB instance and configure it with a user and database.
2. Create the following environment variables, or use the REST API to set them yourself.

| Key | Content |
|-----|---------|
| MONZO_USER_ID | Whatever your Monzo user ID is, retrieve it from **[https://developers.monzo.com/](Monzo Developer API)**. |
| MONZO_ACCESS_TOKEN | Whatever your Monzo Access Token is, retrieve it from **[https://developers.monzo.com/](Monzo Developer API)**. |
| TAX_RATE | The country within the UK in which you live, options include: *Scotland, England, Wales, Northern Ireland* |
3. Run the app. 

If you've done everything correctly, then this should fire up properly without any issue. If for whatever reason it doesn't work, create an issue, and I'll look into it.