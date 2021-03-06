const base = require('./tailwind.base.config');
const path = require('path')

const config = {
  ...base,
  purge: {
    enabled: true,
    content: [
      path.resolve(__dirname, './target/scala-2.13/me-opt/*.js'),
      path.resolve(__dirname, './index.html'),
    ]
  }
};

module.exports = config;
