import { resolve } from 'path'
import { injectHtml } from 'vite-plugin-html'

const scalaVersion = '2.13'

export default ({ mode }) => {
  const mainJS = `/site/target/scala-${scalaVersion}/site-${mode === 'production' ? 'opt' : 'fastopt'}/main.js`
  console.log('mainJS', mainJS)
  return {
    publicDir: './public',
    plugins: [
      injectHtml({
        injectData: {
          mainJS
        }
      })
    ],
    resolve: {
      alias: {
        'stylesheets': resolve(__dirname, './public/css')
      }
    }
  }
}