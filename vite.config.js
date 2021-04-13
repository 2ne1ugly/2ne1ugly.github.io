import { resolve } from 'path'
import { injectHtml } from 'vite-plugin-html'

const scalaVersion = '2.13'

export default ({ command, mode }) => {
  const mainJS = `/site/target/scala-${scalaVersion}/site-${mode === 'production' ? 'opt' : 'fastopt'}/main.js`
  console.log('mainJS', mainJS)
  return {
    publicDir: './public',
    base: command === "build" ? "/me/" : "/",
    plugins: [
      injectHtml({
        injectData: {
          mainJS
        }
      })
    ],
    resolve: {
      alias: {
        'stylesheets': resolve(__dirname, './stylesheets')
      }
    }
  }
}