module.exports = () => {
  return {
    plugins: [
      require('postcss-import')({}),
      require('postcss-preset-env')({}),
      require('tailwindcss')('./tailwind.config.js'),
    ]
  };
}
