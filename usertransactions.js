const https = require("https");

async function getNumTransactions(username) {
  const getUserId = (username) => {
    const url = `https://jsonmock.hackerrank.com/api/article_users?username=${username}`;

    return new Promise((resolve, reject) => {
      https
        .get(url, (res) => {
          let data = "";

          res.on("data", (chunk) => {
            data += chunk;
          });

          res.on("end", () => {
            const result = JSON.parse(data);
            if (result.data.length === 0) {
              console.log("Username Not Found");
              resolve("Username Not Found");
            } else {
              resolve(result.data[0].id);
            }
          });
        })
        .on("error", (e) => {
          reject(e);
        });
    });
  };

  const getTransactions = (userId) => {
    const url = `https://jsonmock.hackerrank.com/api/transactions?userId=${userId}`;

    return new Promise((resolve, reject) => {
      https
        .get(url, (res) => {
          let data = "";

          res.on("data", (chunk) => {
            data += chunk;
          });

          res.on("end", () => {
            const result = JSON.parse(data);
            resolve(result.total);
          });
        })
        .on("error", (e) => {
          reject(e);
        });
    });
  };

  try {
    const userId = await getUserId(username);
    if (userId === null) {
      console.log("Username Not Found");
      return "Username Not Found";
    }
    const numTransactions = await getTransactions(userId);
    return numTransactions;
  } catch (error) {
    console.error(error);
    throw error;
  }
}

getNumTransactions("jay");
