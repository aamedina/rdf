(ns net.wikipunk.rdf.exif
  {:dcat/downloadURL  "resources/exif.rdf",
   :rdf/ns-prefix-map {"dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "ex"      "http://example.org/",
                       "exif"    "http://www.w3.org/2003/12/exif/ns#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "exif",
   :rdfa/uri          "http://www.w3.org/2003/12/exif/ns#",
   :reasoner          nil})

(def IFD
  "An Image File Directory"
  {:db/ident     :exif/IFD,
   :rdf/type     :rdfs/Class,
   :rdfs/comment #rdf/langString "An Image File Directory@en",
   :rdfs/label   #rdf/langString "IFD@en"})

(def _unknown
  "An Exif tag whose meaning is not known"
  {:db/ident     :exif/_unknown,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString "An Exif tag whose meaning is not known@en",
   :rdfs/label   #rdf/langString "Unknown tag@en"})

(def apertureValue
  "ApertureValue"
  {:db/ident :exif/apertureValue,
   :exif/tag_number #rdf/langString "37378@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "レンズ絞り値（APEX値）。この値のルート2のベキ乗を取ると、通常の絞り値となる。例えば'5'の場合だと√2^5=F5.6@ja"
    #rdf/langString "The lens aperture. The unit is the APEX value.@en"],
   :rdfs/label #rdf/langString "ApertureValue@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def artist
  "Person who created the image"
  {:db/ident           :exif/artist,
   :exif/tag_number    #rdf/langString "315@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "Person who created the image@en",
   :rdfs/label         #rdf/langString "Artist@en",
   :rdfs/subPropertyOf [:dc11/creator :exif/exifAttribute]})

(def bitsPerSample
  "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/bitsPerSample,
   :exif/tag_number #rdf/langString "258@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #rdf/langString "BitsPerSample@en",
   :rdfs/subPropertyOf [:exif/resolution :exif/imageDataStruct]})

(def brightnessValue
  "BrightnessValue"
  {:db/ident :exif/brightnessValue,
   :exif/tag_number #rdf/langString "37379@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "画像撮影時の撮影対象物の明るさ（APEX値）。EVにするにはISO感度の値を足す必要があり、Ev:Exposure, Bv:BrightnessValue, Sv:SensitivityValueとしてEv=Bv+Sv Sv=log^2(ISOSpeedRating/3.125)という計算式を使う。ISO感度100の場合Sv=5、ISO200の場合Sv=6、ISO125ではSv=5.32@ja"
    #rdf/langString
     "The value of brightness. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99. Note that if the numerator of the recorded value is FFFFFFFF.H, Unknown shall be indicated.@en"],
   :rdfs/label #rdf/langString "BrightnessValue@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def cfaPattern
  "CFAPattern"
  {:db/ident :exif/cfaPattern,
   :exif/tag_number #rdf/langString "41730@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "CCDに付いているColor filter array(CFA)のパターン。例えば普通のRGBフィルターだと、CFAPatternのデータは 02 02 00 01 01 02@ja"
    #rdf/langString
     "The color filter array (CFA) geometric pattern of the image sensor when a one-chip color area sensor is used. It does not apply to all sensing methods.@en"],
   :rdfs/label #rdf/langString "CFAPattern@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def colorSpace
  "ColorSpace"
  {:db/ident :exif/colorSpace,
   :exif/tag_number #rdf/langString "40961@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "使われる色空間。通常sRGB@ja"
    #rdf/langString
     "The color space information tag (ColorSpace) is always recorded as the color space specifier. Normally sRGB (=1) is used to define the color space based on the PC monitor conditions and environment.@en"],
   :rdfs/label #rdf/langString "ColorSpace@en",
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def componentsConfiguration
  "ComponentsConfiguration"
  {:db/ident :exif/componentsConfiguration,
   :exif/tag_number #rdf/langString "37121@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "圧縮データがYCC以外の並びの場合、4バイトでその並びを示す。それぞれの値は0:not exist,1:Y,2:Cb,3:Cr,4:R,5:G,6:B@ja"
    #rdf/langString
     "Information specific to compressed data. The channels of each component are arranged in order from the 1st component to the 4th. For uncompressed data the data arrangement is given in the PhotometricInterpretation tag. However, since PhotometricInterpretation can only express the order of Y,Cb and Cr, this tag is provided for cases when compressed data uses components other than Y, Cb, and Cr and to enable support of other sequences.@en"],
   :rdfs/label #rdf/langString "ComponentsConfiguration@en",
   :rdfs/subPropertyOf :exif/imageConfig})

(def compressedBitsPerPixel
  "CompressedBitsPerPixel"
  {:db/ident :exif/compressedBitsPerPixel,
   :exif/tag_number #rdf/langString "37122@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画像の圧縮率@ja"
    #rdf/langString
     "Information specific to compressed data. The compression mode used for a compressed image is indicated in unit bits per pixel.@en"],
   :rdfs/label #rdf/langString "CompressedBitsPerPixel@en",
   :rdfs/subPropertyOf :exif/imageConfig})

(def compression
  "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6."
  {:db/ident :exif/compression,
   :exif/tag_number #rdf/langString "259@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6.@en",
   :rdfs/label #rdf/langString "Compression@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def contrast
  "The direction of contrast processing applied by the camera when the image was shot."
  {:db/ident :exif/contrast,
   :exif/tag_number #rdf/langString "41992@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The direction of contrast processing applied by the camera when the image was shot.@en",
   :rdfs/label #rdf/langString "Contrast@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def copyright
  "Copyright"
  {:db/ident :exif/copyright,
   :exif/tag_number #rdf/langString "33432@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "この画像の撮影者および編集者の著作権情報@ja"
    #rdf/langString
     "Copyright information. In this standard the tag is used to indicate both the photographer and editor copyrights. It is the copyright notice of the person or organization claiming rights to the image.@en"],
   :rdfs/label #rdf/langString "Copyright@en",
   :rdfs/subPropertyOf [:dc11/rights :exif/exifAttribute]})

(def customRendered
  "CustomRendered"
  {:db/ident :exif/customRendered,
   :exif/tag_number #rdf/langString "41985@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "特別なレンダリング処理を行っているかどうか@ja"
    #rdf/langString
     "The use of special processing on image data, such as rendering geared to output. When special processing is performed, the reader is expected to disable or minimize any further processing.@en"],
   :rdfs/label #rdf/langString "CustomRendered@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def datatype
  "The Exif field data type, such as ascii, byte, short etc."
  {:db/ident :exif/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The Exif field data type, such as ascii, byte, short etc.@en",
   :rdfs/label #rdf/langString "Data Type@en",
   :rdfs/subPropertyOf :dc11/type})

(def date
  "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format"
  {:db/ident :exif/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format@en",
   :rdfs/label #rdf/langString "Date@en",
   :rdfs/subPropertyOf :dc11/date})

(def dateAndOrTime
  "An attribute relating to Date and/or Time"
  {:db/ident           :exif/dateAndOrTime,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to Date and/or Time@en",
   :rdfs/label         #rdf/langString "Date and/or Time@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def dateTime
  "DateTime"
  {:db/ident :exif/dateTime,
   :exif/tag_number #rdf/langString "306@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "この画像が作成（あるいは最後に変更された）日時。通常はDateTimeOriginaと同じ値@ja"
    #rdf/langString
     "The date and time of image creation. In this standard it is the date and time the file was changed.@en"],
   :rdfs/label #rdf/langString "DateTime@en",
   :rdfs/subPropertyOf [:exif/date :exif/exifAttribute]})

(def dateTimeDigitized
  "DateTimeDigitized"
  {:db/ident :exif/dateTimeDigitized,
   :exif/tag_number #rdf/langString "36868@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画像がデジタル化された日時。デジカメ画像なら通常DateTimeOriginalと同じ値@ja"
    #rdf/langString
     "The date and time when the image was stored as digital data. If, for example, an image was captured by DSC and at the same time the file was recorded, then the DateTimeOriginal and DateTimeDigitized will have the same contents.@en"],
   :rdfs/label #rdf/langString "DateTimeDigitized@en",
   :rdfs/subPropertyOf [:exif/date :exif/dateAndOrTime]})

(def dateTimeOriginal
  "DateTimeOriginal"
  {:db/ident :exif/dateTimeOriginal,
   :exif/tag_number #rdf/langString "36867@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "オリジナル画像が作成（撮影）された日時@ja"
    #rdf/langString
     "The date and time when the original image data was generated. For a DSC the date and time the picture was taken are recorded.@en"],
   :rdfs/label #rdf/langString "DateTimeOriginal@en",
   :rdfs/subPropertyOf [:exif/date :exif/dateAndOrTime]})

(def deviceSettingDescription
  "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader."
  {:db/ident :exif/deviceSettingDescription,
   :exif/tag_number #rdf/langString "41995@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader.@en",
   :rdfs/label #rdf/langString "DeviceSettingDescription@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def digitalZoomRatio
  "DigitalZoomRatio"
  {:db/ident :exif/digitalZoomRatio,
   :exif/tag_number #rdf/langString "41988@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "デジタルズームが使われた場合、その比率@ja"
    #rdf/langString
     "The digital zoom ratio when the image was shot. If the numerator of the recorded value is 0, this indicates that digital zoom was not used.@en"],
   :rdfs/label #rdf/langString "DigitalZoomRatio@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def exifAttribute
  "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags."
  {:db/ident :exif/exifAttribute,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags.@en",
   :rdfs/domain :exif/IFD,
   :rdfs/label #rdf/langString "Exif Attribute@en"})

(def exifVersion
  "ExifVersion"
  {:db/ident           :exif/exifVersion,
   :exif/tag_number    #rdf/langString "36864@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "Exif形式のバージョン@ja"
                        #rdf/langString "Exif Version@en"],
   :rdfs/label         #rdf/langString "ExifVersion@en",
   :rdfs/subPropertyOf :exif/versionInfo})

(def exif_IFD_Pointer
  "Exif IFD Pointer"
  {:db/ident :exif/exif_IFD_Pointer,
   :exif/tag_number #rdf/langString "34665@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "Exif IFDへのポインタ@ja"
    #rdf/langString
     "A pointer to the Exif IFD, which is a set of tags for recording Exif-specific attribute information.@en"],
   :rdfs/label #rdf/langString "Exif IFD Pointer@en",
   :rdfs/subPropertyOf :exif/ifdPointer})

(def exifdata
  "An Exif IFD data entry"
  {:db/ident     :exif/exifdata,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString "An Exif IFD data entry@en",
   :rdfs/label   #rdf/langString "Exif data@en"})

(def exposureBiasValue
  "ExposureBiasValue"
  {:db/ident :exif/exposureBiasValue,
   :exif/tag_number #rdf/langString "37380@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "撮影時の露光補正量。単位はAPEX値(EV)@ja"
    #rdf/langString
     "The exposure bias. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99.@en"],
   :rdfs/label #rdf/langString "ExposureBiasValue@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureIndex
  "ExposureIndex"
  {:db/ident :exif/exposureIndex,
   :exif/tag_number #rdf/langString "41493@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "CCD感度。データ形式が符号なし分数である事を除き、ISOSpeedRatingsと同じ@ja"
    #rdf/langString
     "The exposure index selected on the camera or input device at the time the image is captured.@en"],
   :rdfs/label #rdf/langString "ExposureIndex@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureMode
  "ExposureMode"
  {:db/ident :exif/exposureMode,
   :exif/tag_number #rdf/langString "41986@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "露光モード@ja"
    #rdf/langString
     "the exposure mode set when the image was shot. In auto-bracketing mode, the camera shoots a series of frames of the same scene at different exposure settings.@en"],
   :rdfs/label #rdf/langString "ExposureMode@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureProgram
  "ExposureProgram"
  {:db/ident :exif/exposureProgram,
   :exif/tag_number #rdf/langString "34850@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "露光制御のモード@ja"
    #rdf/langString
     "The class of the program used by the camera to set exposure when the picture is taken.@en"],
   :rdfs/label #rdf/langString "ExposureProgram@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def exposureTime
  "ExposureTime"
  {:db/ident           :exif/exposureTime,
   :exif/tag_number    #rdf/langString "33434@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "露光時間（シャッター速度の逆数）。単位は秒@ja"
                        #rdf/langString
                         "Exposure time, given in seconds (sec).@en"],
   :rdfs/label         #rdf/langString "ExposureTime@en",
   :rdfs/subPropertyOf [:exif/seconds :exif/pictTaking]})

(def fNumber
  "FNumber"
  {:db/ident           :exif/fNumber,
   :exif/tag_number    #rdf/langString "33437@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "レンズのF値@ja"
                        #rdf/langString "F number@en"],
   :rdfs/label         #rdf/langString "FNumber@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def fileSource
  "FileSource"
  {:db/ident :exif/fileSource,
   :exif/tag_number #rdf/langString "41728@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画像がどういうデバイスから得られたか。通常3=DSC@ja"
    #rdf/langString
     "The image source. If a DSC recorded the image, this tag value of this tag always be set to 3, indicating that the image was recorded on a DSC.@en"],
   :rdfs/label #rdf/langString "FileSource@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def flash
  "Flash"
  {:db/ident           :exif/flash,
   :exif/tag_number    #rdf/langString "37385@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "フラッシュ発光の状態@ja"
                        #rdf/langString
                         "The status of flash when the image was shot.@en"],
   :rdfs/label         #rdf/langString "Flash@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def flashEnergy
  "FlashEnergy"
  {:db/ident :exif/flashEnergy,
   :exif/tag_number #rdf/langString "41483@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "BCPSによるストロボの強度@ja"
    #rdf/langString
     "The strobe energy at the time the image is captured, as measured in Beam Candle Power Seconds (BCPS).@en"],
   :rdfs/label #rdf/langString "FlashEnergy@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def flashpixVersion
  "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII."
  {:db/ident :exif/flashpixVersion,
   :exif/tag_number #rdf/langString "40960@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII.@en",
   :rdfs/label #rdf/langString "FlashpixVersion@en",
   :rdfs/subPropertyOf :exif/versionInfo})

(def focalLength
  "FocalLength"
  {:db/ident :exif/focalLength,
   :exif/tag_number #rdf/langString "37386@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "レンズの焦点距離。単位はmm@ja"
    #rdf/langString
     "The actual focal length of the lens, in mm. Conversion is not made to the focal length of a 35 mm film camera.@en"],
   :rdfs/label #rdf/langString "FocalLength@en",
   :rdfs/subPropertyOf [:exif/mm :exif/pictTaking]})

(def focalLengthIn35mmFilm
  "FocalLengthIn35mmFilm"
  {:db/ident :exif/focalLengthIn35mmFilm,
   :exif/tag_number #rdf/langString "41989@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "35mm換算した焦点距離@ja"
    #rdf/langString
     "The equivalent focal length assuming a 35mm film camera, in mm. A value of 0 means the focal length is unknown. Note that this tag differs from the FocalLength tag.@en"],
   :rdfs/label #rdf/langString "FocalLengthIn35mmFilm@en",
   :rdfs/subPropertyOf [:exif/length :exif/pictTaking]})

(def focalPlaneResolutionUnit
  "FocalPlaneResolutionUnit"
  {:db/ident :exif/focalPlaneResolutionUnit,
   :exif/tag_number #rdf/langString "41488@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "CCD画素密度の単位@ja"
    #rdf/langString
     "The unit for measuring FocalPlaneXResolution and FocalPlaneYResolution. This value is the same as the ResolutionUnit.@en"],
   :rdfs/label #rdf/langString "FocalPlaneResolutionUnit@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def focalPlaneXResolution
  "FocalPlaneXResolution"
  {:db/ident :exif/focalPlaneXResolution,
   :exif/tag_number #rdf/langString "41486@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "撮影画像のCCD位置での水平解像度。この値とFocalPlaneYResolution、FocalLengthを使うと、レンズ焦点距離の35mmカメラ換算値が計算できる。例えば200万画素機を使いVGAモードの画像を撮ったような場合はこの値はVGAの解像度でリサンプルされた値になっており、CCDの画素ピッチそのままの値ではないので注意が必要@ja"
    #rdf/langString
     "The number of pixels in the image width (X) direction per FocalPlaneResolutionUnit on the camera focal plane.@en"],
   :rdfs/label #rdf/langString "FocalPlaneXResolution@en",
   :rdfs/subPropertyOf [:exif/resolution :exif/pictTaking]})

(def focalPlaneYResolution
  "FocalPlaneYResolution"
  {:db/ident :exif/focalPlaneYResolution,
   :exif/tag_number #rdf/langString "41487@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "撮影画像のCCD位置での垂直解像度@ja"
    #rdf/langString
     "The number of pixels in the image height (Y) direction per FocalPlaneResolutionUnit on the camera focal plane.@en"],
   :rdfs/label #rdf/langString "FocalPlaneYResolution@en",
   :rdfs/subPropertyOf [:exif/resolution :exif/pictTaking]})

(def gainControl
  "The degree of overall image gain adjustment."
  {:db/ident           :exif/gainControl,
   :exif/tag_number    #rdf/langString "41991@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "The degree of overall image gain adjustment.@en",
   :rdfs/label         #rdf/langString "GainControl@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def geo
  "Geometric data such as latitude, longitude and altitude. Usually saved as rational number."
  {:db/ident :exif/geo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Geometric data such as latitude, longitude and altitude. Usually saved as rational number.@en",
   :rdfs/label #rdf/langString "Geometric data@en"})

(def gpsAltitude
  "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters."
  {:db/ident :exif/gpsAltitude,
   :exif/tag_number #rdf/langString "6@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters.@en",
   :rdfs/label #rdf/langString "GPSAltitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo]})

(def gpsAltitudeRef
  "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters."
  {:db/ident :exif/gpsAltitudeRef,
   :exif/tag_number #rdf/langString "5@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters.@en",
   :rdfs/label #rdf/langString "GPSAltitudeRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsAreaInformation
  "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area."
  {:db/ident :exif/gpsAreaInformation,
   :exif/tag_number #rdf/langString "28@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area.@en",
   :rdfs/label #rdf/langString "GPSAreaInformation@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDOP
  "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement."
  {:db/ident :exif/gpsDOP,
   :exif/tag_number #rdf/langString "11@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement.@en",
   :rdfs/label #rdf/langString "GPSDOP@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDateStamp
  "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF"
  {:db/ident :exif/gpsDateStamp,
   :exif/tag_number #rdf/langString "29@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF@en",
   :rdfs/label #rdf/langString "GPSDateStamp@en",
   :rdfs/subPropertyOf [:exif/date :exif/gpsInfo]})

(def gpsDestBearing
  "The bearing to the destination point. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsDestBearing,
   :exif/tag_number #rdf/langString "24@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The bearing to the destination point. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #rdf/langString "GPSDestBearing@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestBearingRef
  "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsDestBearingRef,
   :exif/tag_number #rdf/langString "23@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #rdf/langString "GPSDestBearingRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestDistance
  "The distance to the destination point."
  {:db/ident           :exif/gpsDestDistance,
   :exif/tag_number    #rdf/langString "26@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "The distance to the destination point.@en",
   :rdfs/label         #rdf/langString "GPSDestDistance@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestDistanceRef
  "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots."
  {:db/ident :exif/gpsDestDistanceRef,
   :exif/tag_number #rdf/langString "25@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots.@en",
   :rdfs/label #rdf/langString "GPSDestDistanceRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestLatitude
  "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLatitude,
   :exif/tag_number #rdf/langString "20@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.@en",
   :rdfs/label #rdf/langString "GPSDestLatitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo]})

(def gpsDestLatitudeRef
  "Reference for latitude of destination"
  {:db/ident           :exif/gpsDestLatitudeRef,
   :exif/tag_number    #rdf/langString "19@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Reference for latitude of destination@en",
   :rdfs/label         #rdf/langString "GPSDestLatitudeRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDestLongitude
  "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLongitude,
   :exif/tag_number #rdf/langString "22@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.@en",
   :rdfs/label #rdf/langString "GPSDestLongitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo]})

(def gpsDestLongitudeRef
  "Reference for longitude of destination"
  {:db/ident           :exif/gpsDestLongitudeRef,
   :exif/tag_number    #rdf/langString "21@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Reference for longitude of destination@en",
   :rdfs/label         #rdf/langString "GPSDestLongitudeRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsDifferential
  "Indicates whether differential correction is applied to the GPS receiver."
  {:db/ident :exif/gpsDifferential,
   :exif/tag_number #rdf/langString "30@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Indicates whether differential correction is applied to the GPS receiver.@en",
   :rdfs/label #rdf/langString "GPSDifferential@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsImgDirection
  "The direction of the image when it was captured. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsImgDirection,
   :exif/tag_number #rdf/langString "17@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The direction of the image when it was captured. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #rdf/langString "GPSImgDirection@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsImgDirectionRef
  "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsImgDirectionRef,
   :exif/tag_number #rdf/langString "16@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #rdf/langString "GPSImgDirectionRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsInfo
  "An attribute relating to GPS information"
  {:db/ident           :exif/gpsInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to GPS information@en",
   :rdfs/label         #rdf/langString "GPS Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def gpsInfo_IFD_Pointer
  "GPSInfo IFD Pointer"
  {:db/ident :exif/gpsInfo_IFD_Pointer,
   :exif/tag_number #rdf/langString "34853@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "GPS IFDへのポインタ@ja"
    #rdf/langString
     "A pointer to the GPS IFD, which is a set of tags for recording GPS information.@en"],
   :rdfs/label #rdf/langString "GPSInfo IFD Pointer@en",
   :rdfs/subPropertyOf :exif/ifdPointer})

(def gpsLatitude
  "GPSLatitude"
  {:db/ident :exif/gpsLatitude,
   :exif/tag_number #rdf/langString "2@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "緯度@ja"
    #rdf/langString
     "The latitude, expressed as three values giving the degrees, minutes, and seconds, respectively.@en"],
   :rdfs/label #rdf/langString "GPSLatitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo]})

(def gpsLatitudeRef
  "GPSLatitudeRef"
  {:db/ident :exif/gpsLatitudeRef,
   :exif/tag_number #rdf/langString "1@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "緯度の北緯もしくは南緯@ja"
    #rdf/langString
     "Indicates whether the latitude is north or south latitude. The ASCII value 'N' indicates north latitude, and 'S' is south latitude.@en"],
   :rdfs/label #rdf/langString "GPSLatitudeRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsLongitude
  "GPSLongitude"
  {:db/ident :exif/gpsLongitude,
   :exif/tag_number #rdf/langString "4@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "経度@ja"
    #rdf/langString
     "The longitude, expressed as three values giving the degrees, minutes, and seconds, respectively.@en"],
   :rdfs/label #rdf/langString "GPSLongitude@en",
   :rdfs/subPropertyOf [:exif/geo :exif/gpsInfo]})

(def gpsLongitudeRef
  "GPSLongitudeRef"
  {:db/ident :exif/gpsLongitudeRef,
   :exif/tag_number #rdf/langString "3@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "経度の東経もしくは西経@ja"
    #rdf/langString
     "Indicates whether the longitude is east or west longitude. ASCII 'E' indicates east longitude, and 'W' is west longitude.@en"],
   :rdfs/label #rdf/langString "GPSLongitudeRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsMapDatum
  "GPSMapDatum"
  {:db/ident :exif/gpsMapDatum,
   :exif/tag_number #rdf/langString "18@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "測地系。日本なら'TOKYO'もしくは'WGS-84'@ja"
    #rdf/langString
     "The geodetic survey data used by the GPS receiver. If the survey data is restricted to Japan, the value of this tag is 'TOKYO' or 'WGS-84'. If a GPS Info tag is recorded, it is strongly recommended that this tag be recorded.@en"],
   :rdfs/label #rdf/langString "GPSMapDatum@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsMeasureMode
  "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress."
  {:db/ident :exif/gpsMeasureMode,
   :exif/tag_number #rdf/langString "10@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress.@en",
   :rdfs/label #rdf/langString "GPSMeasureMode@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsProcessingMethod
  "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method."
  {:db/ident :exif/gpsProcessingMethod,
   :exif/tag_number #rdf/langString "27@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method.@en",
   :rdfs/label #rdf/langString "GPSProcessingMethod@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsSatellites
  "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL."
  {:db/ident :exif/gpsSatellites,
   :exif/tag_number #rdf/langString "8@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL.@en",
   :rdfs/label #rdf/langString "GPSSatellites@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsSpeed
  "The speed of GPS receiver movement."
  {:db/ident           :exif/gpsSpeed,
   :exif/tag_number    #rdf/langString "13@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "The speed of GPS receiver movement.@en",
   :rdfs/label         #rdf/langString "GPSSpeed@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsSpeedRef
  "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots."
  {:db/ident :exif/gpsSpeedRef,
   :exif/tag_number #rdf/langString "12@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots.@en",
   :rdfs/label #rdf/langString "GPSSpeedRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsStatus
  "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability."
  {:db/ident :exif/gpsStatus,
   :exif/tag_number #rdf/langString "9@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability.@en",
   :rdfs/label #rdf/langString "GPSStatus@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsTimeStamp
  "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second."
  {:db/ident :exif/gpsTimeStamp,
   :exif/tag_number #rdf/langString "7@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second.@en",
   :rdfs/label #rdf/langString "GPSTimeStamp@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsTrack
  "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsTrack,
   :exif/tag_number #rdf/langString "15@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99.@en",
   :rdfs/label #rdf/langString "GPSTrack@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsTrackRef
  "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsTrackRef,
   :exif/tag_number #rdf/langString "14@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction.@en",
   :rdfs/label #rdf/langString "GPSTrackRef@en",
   :rdfs/subPropertyOf :exif/gpsInfo})

(def gpsVersionID
  "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present."
  {:db/ident :exif/gpsVersionID,
   :exif/tag_number #rdf/langString "0@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present.@en",
   :rdfs/label #rdf/langString "GPSVersionID@en",
   :rdfs/subPropertyOf [:exif/versionInfo :exif/gpsInfo]})

(def height
  "Height of an object"
  {:db/ident           :exif/height,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "Height of an object@en",
   :rdfs/label         #rdf/langString "Height@en",
   :rdfs/subPropertyOf :exif/length})

(def ifdPointer
  "A tag that refers a child IFD"
  {:db/ident           :exif/ifdPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "A tag that refers a child IFD@en",
   :rdfs/label         #rdf/langString "IFD Pointer@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageConfig
  "An attribute relating to Image Configuration"
  {:db/ident           :exif/imageConfig,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to Image Configuration@en",
   :rdfs/label         #rdf/langString "Image Config@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDataCharacter
  "An attribute relating to image data characteristics"
  {:db/ident :exif/imageDataCharacter,
   :rdf/type :rdf/Property,
   :rdfs/comment #rdf/langString
                  "An attribute relating to image data characteristics@en",
   :rdfs/label #rdf/langString "Image Data Character@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDataStruct
  "An attribute relating to image data structure"
  {:db/ident           :exif/imageDataStruct,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to image data structure@en",
   :rdfs/label         #rdf/langString "Image Data Structure@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def imageDescription
  "ImageDescription"
  {:db/ident :exif/imageDescription,
   :exif/tag_number #rdf/langString "270@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "この画像についての説明。漢字等の2バイト文字の使用は禁止@ja"
    #rdf/langString
     "A character string giving the title of the image. It may be a comment such as \"1988 company picnic\" or the like. Two-byte character codes cannot be used. When a 2-byte code is necessary, the Exif Private tag UserComment is to be used.@en"],
   :rdfs/label #rdf/langString "ImageDescription@en",
   :rdfs/subPropertyOf [:dc11/title :exif/exifAttribute]})

(def imageLength
  "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used."
  {:db/ident :exif/imageLength,
   :exif/tag_number #rdf/langString "257@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used.@en",
   :rdfs/label #rdf/langString "ImageLength@en",
   :rdfs/subPropertyOf [:exif/height :exif/imageDataStruct]})

(def imageUniqueID
  "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length."
  {:db/ident :exif/imageUniqueID,
   :exif/tag_number #rdf/langString "42016@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length.@en",
   :rdfs/label #rdf/langString "ImageUniqueID@en",
   :rdfs/subPropertyOf [:dc11/identifier :exif/exifAttribute]})

(def imageWidth
  "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/imageWidth,
   :exif/tag_number #rdf/langString "256@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #rdf/langString "ImageWidth@en",
   :rdfs/subPropertyOf [:exif/width :exif/imageDataStruct]})

(def interopInfo
  "An attribute relating to Interoperability. Tags stored in\nInteroperability IFD may be defined dependently to each Interoperability rule."
  {:db/ident :exif/interopInfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "An attribute relating to Interoperability. Tags stored in\nInteroperability IFD may be defined dependently to each Interoperability rule.@en",
   :rdfs/label #rdf/langString "Interoperability Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def interoperabilityIndex
  "InteroperabilityIndex"
  {:db/ident :exif/interoperabilityIndex,
   :exif/tag_number #rdf/langString "1@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "メイン画像のInteroperability IFDで、データの内容がExifR98 v1.0準拠の場合は、'R98'の文字列。サムネィル画像のInteroperability IFDの場合は、'THM'の文字列@ja"
    #rdf/langString
     "Indicates the identification of the Interoperability rule. 'R98' = conforming to R98 file specification of Recommended Exif Interoperability Rules (ExifR98) or to DCF basic file stipulated by Design Rule for Camera File System. 'THM' = conforming to DCF thumbnail file stipulated by Design rule for Camera File System.@en"],
   :rdfs/label #rdf/langString "InteroperabilityIndex@en",
   :rdfs/subPropertyOf :exif/interopInfo})

(def interoperabilityVersion
  "InteroperabilityVersion"
  {:db/ident           :exif/interoperabilityVersion,
   :exif/tag_number    #rdf/langString "2@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString
                         "データの内容がExifR98 v1.0準拠の場合は、'0100'の文字列。@ja"
                        #rdf/langString "Interoperability Version@en"],
   :rdfs/label         #rdf/langString "InteroperabilityVersion@en",
   :rdfs/subPropertyOf :exif/interopInfo})

(def interoperability_IFD_Pointer
  "Interoperability IFD Pointer"
  {:db/ident :exif/interoperability_IFD_Pointer,
   :exif/tag_number #rdf/langString "40965@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "Interoperability IFDへのポインタ@ja"
    #rdf/langString
     "A pointer to the Interoperability IFD, which is composed of tags storing the information to ensure the Interoperability@en"],
   :rdfs/label #rdf/langString "Interoperability IFD Pointer@en",
   :rdfs/subPropertyOf :exif/ifdPointer})

(def isoSpeedRatings
  "ISOSpeedRatings"
  {:db/ident :exif/isoSpeedRatings,
   :exif/tag_number #rdf/langString "34855@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "CCD感度の銀塩フィルム換算値@ja"
    #rdf/langString
     "Indicates the ISO Speed and ISO Latitude of the camera or input device as specified in ISO 12232.@en"],
   :rdfs/label #rdf/langString "ISOSpeedRatings@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def jpegInterchangeFormat
  "JPEGInterchangeFormat"
  {:db/ident :exif/jpegInterchangeFormat,
   :exif/tag_number #rdf/langString "513@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "圧縮されたサムネイルへのオフセット@ja"
    #rdf/langString
     "The offset to the start byte (SOI) of JPEG compressed thumbnail data. This is not used for primary image JPEG data.@en"],
   :rdfs/label #rdf/langString "JPEGInterchangeFormat@en",
   :rdfs/subPropertyOf :exif/recOffset})

(def jpegInterchangeFormatLength
  "JPEGInterchangeFormatLength"
  {:db/ident :exif/jpegInterchangeFormatLength,
   :exif/tag_number #rdf/langString "514@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "圧縮されたサムネイルのサイズ@ja"
    #rdf/langString
     "The number of bytes of JPEG compressed thumbnail data. This is not used for primary image JPEG data.@en"],
   :rdfs/label #rdf/langString "JPEGInterchangeFormatLength@en",
   :rdfs/subPropertyOf :exif/recOffset})

(def length
  "Length of an object. Could be a subProperty of other general schema."
  {:db/ident :exif/length,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Length of an object. Could be a subProperty of other general schema.@en",
   :rdfs/label #rdf/langString "Length@en"})

(def lightSource
  "LightSource"
  {:db/ident :exif/lightSource,
   :exif/tag_number #rdf/langString "37384@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#rdf/langString "光源。これはマニュアルでホワイトバランスを設定した場合のモード値となる@ja"
                  #rdf/langString
                   "Light source such as Daylight, Tungsten, Flash etc.@en"],
   :rdfs/label #rdf/langString "LightSource@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def make
  "Make"
  {:db/ident           :exif/make,
   :exif/tag_number    #rdf/langString "271@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "カメラのメーカー名。DCFでは必須@ja"
                        #rdf/langString
                         "Manufacturer of image input equipment@en"],
   :rdfs/label         #rdf/langString "Make@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute]})

(def makerNote
  "MakerNote"
  {:db/ident           :exif/makerNote,
   :exif/tag_number    #rdf/langString "37500@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "カメラの内部情報等、メーカー依存データ@ja"
                        #rdf/langString "Manufacturer notes@en"],
   :rdfs/label         #rdf/langString "MakerNote@en",
   :rdfs/subPropertyOf :exif/userInfo})

(def maxApertureValue
  "MaxApertureValue"
  {:db/ident :exif/maxApertureValue,
   :exif/tag_number #rdf/langString "37381@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "レンズの開放F値。ApertureValue同様、ルート2のベキ乗を取ると通常の絞り値に換算できる@ja"
    #rdf/langString
     "The smallest F number of the lens. The unit is the APEX value. Ordinarily it is given in the range of 00.00 to 99.99, but it is not limited to this range.@en"],
   :rdfs/label #rdf/langString "MaxApertureValue@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def meter
  "A length with unit of meter"
  {:db/ident           :exif/meter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "A length with unit of meter@en",
   :rdfs/label         #rdf/langString "Meter@en",
   :rdfs/subPropertyOf :exif/length})

(def meteringMode
  "MeteringMode"
  {:db/ident :exif/meteringMode,
   :exif/tag_number #rdf/langString "37383@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "自動露出の測光モード@ja"
    #rdf/langString
     "Metering mode, such as CenterWeightedAverage, Spot, MultiSpot,Pattern, Partial etc.@en"],
   :rdfs/label #rdf/langString "MeteringMode@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def mm
  "A length with unit of mm"
  {:db/ident           :exif/mm,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "A length with unit of mm@en",
   :rdfs/label         #rdf/langString "Milimeter@en",
   :rdfs/subPropertyOf :exif/length})

(def model
  "Model"
  {:db/ident           :exif/model,
   :exif/tag_number    #rdf/langString "272@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "カメラの機種名。DCFでは必須@ja"
                        #rdf/langString "Model of image input equipment@en"],
   :rdfs/label         #rdf/langString "Model@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute]})

(def oecf
  "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values."
  {:db/ident :exif/oecf,
   :exif/tag_number #rdf/langString "34856@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values.@en",
   :rdfs/label #rdf/langString "OECF@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def orientation
  "Orientation"
  {:db/ident :exif/orientation,
   :exif/tag_number #rdf/langString "274@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画像データがどこ(top-leftなど）を起点として、どの向きで格納されているか@ja"
    #rdf/langString
     "The image orientation viewed in terms of rows and columns.@en"],
   :rdfs/label #rdf/langString "Orientation@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def photometricInterpretation
  "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/photometricInterpretation,
   :exif/tag_number #rdf/langString "262@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #rdf/langString "PhotometricInterpretation@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def pictTaking
  "An attribute relating to Picture-Taking Conditions"
  {:db/ident           :exif/pictTaking,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to Picture-Taking Conditions@en",
   :rdfs/label         #rdf/langString "PictTaking@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def pimBrightness
  "Brightness info for print image matching"
  {:db/ident           :exif/pimBrightness,
   :exif/tag_number    #rdf/langString "10@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Brightness info for print image matching@en",
   :rdfs/label         #rdf/langString "PrintIM Brightness@en",
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimColorBalance
  "ColorBalance info for print image matching"
  {:db/ident           :exif/pimColorBalance,
   :exif/tag_number    #rdf/langString "11@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "ColorBalance info for print image matching@en",
   :rdfs/label         #rdf/langString "PrintIM ColorBalance@en",
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimContrast
  "Contrast info for print image matching"
  {:db/ident           :exif/pimContrast,
   :exif/tag_number    #rdf/langString "9@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Contrast info for print image matching@en",
   :rdfs/label         #rdf/langString "PrintIM Contrast@en",
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimInfo
  "An attribute relating to print image matching"
  {:db/ident           :exif/pimInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to print image matching@en",
   :rdfs/label         #rdf/langString "PIM Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def pimSaturation
  "Saturation info for print image matching"
  {:db/ident           :exif/pimSaturation,
   :exif/tag_number    #rdf/langString "12@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Saturation info for print image matching@en",
   :rdfs/label         #rdf/langString "PrintIM Saturation@en",
   :rdfs/subPropertyOf :exif/pimInfo})

(def pimSharpness
  "Sharpness info for print image matching"
  {:db/ident           :exif/pimSharpness,
   :exif/tag_number    #rdf/langString "13@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Sharpness info for print image matching@en",
   :rdfs/label         #rdf/langString "PrintIM Sharpness@en",
   :rdfs/subPropertyOf :exif/pimInfo})

(def pixelXDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file."
  {:db/ident :exif/pixelXDimension,
   :exif/tag_number #rdf/langString "40962@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file.@en",
   :rdfs/label #rdf/langString "PixelXDimension@en",
   :rdfs/subPropertyOf [:exif/width :exif/imageConfig]})

(def pixelYDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF."
  {:db/ident :exif/pixelYDimension,
   :exif/tag_number #rdf/langString "40963@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF.@en",
   :rdfs/label #rdf/langString "PixelYDimension@en",
   :rdfs/subPropertyOf [:exif/height :exif/imageConfig]})

(def planarConfiguration
  "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed."
  {:db/ident :exif/planarConfiguration,
   :exif/tag_number #rdf/langString "284@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed.@en",
   :rdfs/label #rdf/langString "PlanarConfiguration@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def primaryChromaticities
  "PrimaryChromaticities"
  {:db/ident :exif/primaryChromaticities,
   :exif/tag_number #rdf/langString "319@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "原色の色度。CCIR REcommendation 709 primariesを使っている場合は、'640/1000,330/1000,300/1000,600/1000,150/1000,60/1000'という値。通常はColorSpaceタグがあるので不要@ja"
    #rdf/langString
     "The chromaticity of the three primary colors of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en"],
   :rdfs/label #rdf/langString "PrimaryChromaticities@en",
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def printImageMatching_IFD_Pointer
  "A pointer to the print image matching IFD"
  {:db/ident           :exif/printImageMatching_IFD_Pointer,
   :exif/tag_number    #rdf/langString "50341@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "A pointer to the print image matching IFD@en",
   :rdfs/label         #rdf/langString "PrintImageMatching IFD Pointer@en",
   :rdfs/subPropertyOf :exif/ifdPointer})

(def recOffset
  "An attribute relating to recording offset"
  {:db/ident           :exif/recOffset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to recording offset@en",
   :rdfs/label         #rdf/langString "Recording Offset@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def referenceBlackWhite
  "ReferenceBlackWhite"
  {:db/ident :exif/referenceBlackWhite,
   :exif/tag_number #rdf/langString "532@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "画像情報の黒点・白点値。YCbCr形式の場合、最初の２つの値がY(輝度)の黒点・白点、次がCb、最後がCrとなり、デフォルト値は'0,255,0,128,0,128'。RGB形式の場合はR、G、Bの順で黒点・白点値が並んでおり、デフォルト値は'0,255,0,255,0,255'。@ja"
    #rdf/langString
     "The reference black point value and reference white point value. The color space is declared in a color space information tag, with the default being the value that gives the optimal image characteristics Interoperability these conditions.@en"],
   :rdfs/label #rdf/langString "ReferenceBlackWhite@en",
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def relatedFile
  "Tag Relating to Related File Information"
  {:db/ident           :exif/relatedFile,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "Tag Relating to Related File Information@en",
   :rdfs/label         #rdf/langString "Related File@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def relatedImageFileFormat
  "RelatedImageFileFormat"
  {:db/ident :exif/relatedImageFileFormat,
   :exif/tag_number #rdf/langString "4096@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#rdf/langString
                   "画像フォーマットを'Exif JPEG Ver. 2.1'などの文字列で示す。通常はサムネィル画像に使う@ja"
                  #rdf/langString "Related image file format@en"],
   :rdfs/label #rdf/langString "RelatedImageFileFormat@en",
   :rdfs/subPropertyOf :exif/interopInfo})

(def relatedImageLength
  "RelatedImageLength"
  {:db/ident           :exif/relatedImageLength,
   :exif/tag_number    #rdf/langString "4098@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString
                         "画像高。通常はサムネイル画像のInteroperability IFDに使う@ja"
                        #rdf/langString "Related image length@en"],
   :rdfs/label         #rdf/langString "RelatedImageLength@en",
   :rdfs/subPropertyOf [:exif/height :exif/interopInfo]})

(def relatedImageWidth
  "RelatedImageWidth"
  {:db/ident           :exif/relatedImageWidth,
   :exif/tag_number    #rdf/langString "4097@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString
                         "画像幅。通常はサムネイル画像のInteroperability IFDに使う@ja"
                        #rdf/langString "Related image width@en"],
   :rdfs/label         #rdf/langString "RelatedImageWidth@en",
   :rdfs/subPropertyOf [:exif/width :exif/interopInfo]})

(def relatedSoundFile
  "RelatedSoundFile"
  {:db/ident           :exif/relatedSoundFile,
   :exif/tag_number    #rdf/langString "40964@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       [#rdf/langString "画像と一緒に音声録音できる機種の場合に、音声ファイルの名前@ja"
                        #rdf/langString "Related audio file@en"],
   :rdfs/label         #rdf/langString "RelatedSoundFile@en",
   :rdfs/subPropertyOf :exif/relatedFile})

(def resolution
  "a rational number representing a resolution. Could be a subProperty of other general schema."
  {:db/ident :exif/resolution,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "a rational number representing a resolution. Could be a subProperty of other general schema.@en",
   :rdfs/label #rdf/langString "Resolution@en"})

(def resolutionUnit
  "ResolutionUnit"
  {:db/ident :exif/resolutionUnit,
   :exif/tag_number #rdf/langString "296@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "XResolution/YResolutionの解像度の単位@ja"
    #rdf/langString
     "The unit for measuring XResolution and YResolution. The same unit is used for both XResolution and YResolution. If the image resolution in unknown, 2 (inches) is designated.@en"],
   :rdfs/label #rdf/langString "ResolutionUnit@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def rowsPerStrip
  "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/rowsPerStrip,
   :exif/tag_number #rdf/langString "278@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #rdf/langString "RowsPerStrip@en",
   :rdfs/subPropertyOf :exif/recOffset})

(def samplesPerPixel
  "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/samplesPerPixel,
   :exif/tag_number #rdf/langString "277@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #rdf/langString "SamplesPerPixel@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def saturation
  "The direction of saturation processing applied by the camera when the image was shot."
  {:db/ident :exif/saturation,
   :exif/tag_number #rdf/langString "41993@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The direction of saturation processing applied by the camera when the image was shot.@en",
   :rdfs/label #rdf/langString "Saturation@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def sceneCaptureType
  "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag."
  {:db/ident :exif/sceneCaptureType,
   :exif/tag_number #rdf/langString "41990@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag.@en",
   :rdfs/label #rdf/langString "SceneCaptureType@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def sceneType
  "SceneType"
  {:db/ident :exif/sceneType,
   :exif/tag_number #rdf/langString "41729@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画像がどうやって撮られたか。デジカメの場合は通常1=A directly photographed image@ja"
    #rdf/langString
     "The type of scene. If a DSC recorded the image, this tag value shall always be set to 1, indicating that the image was directly photographed.@en"],
   :rdfs/label #rdf/langString "SceneType@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def seconds
  "a mesurement of time length with unit of second"
  {:db/ident     :exif/seconds,
   :rdf/type     :rdf/Property,
   :rdfs/comment #rdf/langString
                  "a mesurement of time length with unit of second@en",
   :rdfs/label   #rdf/langString "Seconds@en"})

(def sensingMethod
  "SensingMethod"
  {:db/ident :exif/sensingMethod,
   :exif/tag_number #rdf/langString "41495@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "イメージセンサーの形式。One-chip color area sensor、Color sequential area sensor、Trilinear sensorなど@ja"
    #rdf/langString
     "The image sensor type on the camera or input device, such as One-chip color area sensor etc.@en"],
   :rdfs/label #rdf/langString "SensingMethod@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def sharpness
  "The direction of sharpness processing applied by the camera when the image was shot."
  {:db/ident :exif/sharpness,
   :exif/tag_number #rdf/langString "41994@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The direction of sharpness processing applied by the camera when the image was shot.@en",
   :rdfs/label #rdf/langString "Sharpness@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def shutterSpeedValue
  "ShutterSpeedValue"
  {:db/ident :exif/shutterSpeedValue,
   :exif/tag_number #rdf/langString "37377@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "シャッター速度（APEX値）。この値の2のベキ乗をとって逆数にすると、通常のシャッター速度表示になる。例えば'4'の場合だと1/(2^4)=1/16秒@ja"
    #rdf/langString
     "Shutter speed. The unit is the APEX (Additive System of Photographic Exposure) setting@en"],
   :rdfs/label #rdf/langString "ShutterSpeedValue@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def software
  "Software"
  {:db/ident :exif/software,
   :exif/tag_number #rdf/langString "305@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "デジカメ（もしくは入力機器）の内蔵ソフトウェア/ファームウェアの名称とバージョン@ja"
    #rdf/langString
     "The name and version of the software or firmware of the camera or image input device used to generate the image.@en"],
   :rdfs/label #rdf/langString "Software@en",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute]})

(def spatialFrequencyResponse
  "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233."
  {:db/ident :exif/spatialFrequencyResponse,
   :exif/tag_number #rdf/langString "41484@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233.@en",
   :rdfs/label #rdf/langString "SpatialFrequencyResponse@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def spectralSensitivity
  "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee."
  {:db/ident :exif/spectralSensitivity,
   :exif/tag_number #rdf/langString "34852@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee.@en",
   :rdfs/label #rdf/langString "SpectralSensitivity@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def stripByteCounts
  "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripByteCounts,
   :exif/tag_number #rdf/langString "279@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #rdf/langString "StripByteCounts@en",
   :rdfs/subPropertyOf :exif/recOffset})

(def stripOffsets
  "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripOffsets,
   :exif/tag_number #rdf/langString "273@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted.@en",
   :rdfs/label #rdf/langString "StripOffsets@en",
   :rdfs/subPropertyOf :exif/recOffset})

(def subSecTime
  "DateTime subseconds"
  {:db/ident           :exif/subSecTime,
   :exif/tag_number    #rdf/langString "37520@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "DateTime subseconds@en",
   :rdfs/label         #rdf/langString "SubSecTime@en",
   :rdfs/subPropertyOf [:exif/subseconds :exif/dateAndOrTime]})

(def subSecTimeDigitized
  "DateTimeDigitized subseconds"
  {:db/ident           :exif/subSecTimeDigitized,
   :exif/tag_number    #rdf/langString "37522@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "DateTimeDigitized subseconds@en",
   :rdfs/label         #rdf/langString "SubSecTimeDigitized@en",
   :rdfs/subPropertyOf [:exif/subseconds :exif/dateAndOrTime]})

(def subSecTimeOriginal
  "DateTimeOriginal subseconds"
  {:db/ident           :exif/subSecTimeOriginal,
   :exif/tag_number    #rdf/langString "37521@en",
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "DateTimeOriginal subseconds@en",
   :rdfs/label         #rdf/langString "SubSecTimeOriginal@en",
   :rdfs/subPropertyOf [:exif/subseconds :exif/dateAndOrTime]})

(def subjectArea
  "SubjectArea"
  {:db/ident :exif/subjectArea,
   :exif/tag_number #rdf/langString "37396@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画面中の主たる被写体の位置。2値によるXY座標、3値による円、4値による長方形座標の3通りの示し方がある@ja"
    #rdf/langString
     "The location and area of the main subject in the overall scene.@en"],
   :rdfs/label #rdf/langString "SubjectArea@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def subjectDistance
  "SubjectDistance"
  {:db/ident :exif/subjectDistance,
   :exif/tag_number #rdf/langString "37382@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "被写体までの距離。単位はm@ja"
    #rdf/langString
     "The distance to the subject, given in meters. Note that if the numerator of the recorded value is FFFFFFFF.H, Infinity shall be indicated; and if the numerator is 0, Distance unknown shall be indicated.@en"],
   :rdfs/label #rdf/langString "SubjectDistance@en",
   :rdfs/subPropertyOf [:exif/meter :exif/pictTaking]})

(def subjectDistanceRange
  "The distance to the subject, such as Macro, Close View or Distant View."
  {:db/ident :exif/subjectDistanceRange,
   :exif/tag_number #rdf/langString "41996@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The distance to the subject, such as Macro, Close View or Distant View.@en",
   :rdfs/label #rdf/langString "SubjectDistanceRange@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def subjectLocation
  "SubjectLocation"
  {:db/ident :exif/subjectLocation,
   :exif/tag_number #rdf/langString "41492@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画面中の主要被写体のXY座標@ja"
    #rdf/langString
     "The location of the main subject in the scene. The value of this tag represents the pixel at the center of the main subject relative to the left edge, prior to rotation processing as per the Rotation tag. The first value indicates the X column number and second indicates the Y row number.@en"],
   :rdfs/label #rdf/langString "SubjectLocation@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def subseconds
  "A tag used to record fractions of seconds for a date property"
  {:db/ident :exif/subseconds,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A tag used to record fractions of seconds for a date property@en",
   :rdfs/label #rdf/langString "Subseconds@en"})

(def tag_number
  "The Exif tag number"
  {:db/ident           :exif/tag_number,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "The Exif tag number@en",
   :rdfs/label         #rdf/langString "Tag number@en",
   :rdfs/subPropertyOf :dc11/identifier})

(def tagid
  "The Exif tag number with context prefix, such as IFD type or maker name"
  {:db/ident :exif/tagid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The Exif tag number with context prefix, such as IFD type or maker name@en",
   :rdfs/label #rdf/langString "Tag ID@en",
   :rdfs/subPropertyOf :exif/tag_number})

(def transferFunction
  "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/transferFunction,
   :exif/tag_number #rdf/langString "301@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en",
   :rdfs/label #rdf/langString "TransferFunction@en",
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def userComment
  "UserComment"
  {:db/ident :exif/userComment,
   :exif/tag_number #rdf/langString "37510@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "ユーザーコメント。ImageDescriptionタグと違って、こちらはJIS2バイトコード、Unicode等での記述が許されており、最初の8バイトが文字コード@ja"
    #rdf/langString
     "A tag for Exif users to write keywords or comments on the image besides those in ImageDescription, and without the character code limitations of the ImageDescription tag. The character code used in the UserComment tag is identified based on an ID code in a fixed 8-byte area at the start of the tag data area.@en"],
   :rdfs/label #rdf/langString "UserComment@en",
   :rdfs/subPropertyOf :exif/userInfo})

(def userInfo
  "An attribute relating to User Information"
  {:db/ident           :exif/userInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString
                        "An attribute relating to User Information@en",
   :rdfs/label         #rdf/langString "User Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def versionInfo
  "An attribute relating to Version"
  {:db/ident           :exif/versionInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "An attribute relating to Version@en",
   :rdfs/label         #rdf/langString "Version Info@en",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def whiteBalance
  "WhiteBalance"
  {:db/ident :exif/whiteBalance,
   :exif/tag_number #rdf/langString "41987@en",
   :rdf/type :rdf/Property,
   :rdfs/comment [#rdf/langString "ホワイトバランスのモード@ja"
                  #rdf/langString
                   "The white balance mode set when the image was shot.@en"],
   :rdfs/label #rdf/langString "WhiteBalance@en",
   :rdfs/subPropertyOf :exif/pictTaking})

(def whitePoint
  "WhitePoint"
  {:db/ident :exif/whitePoint,
   :exif/tag_number #rdf/langString "318@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "白点の色度。CIE Standard Illuminant D65(いわゆる昼光色の世界標準値)を使っていれば、'3127/10000,3290/10000'という値。通常はColorSpaceタグがあるので不要@ja"
    #rdf/langString
     "The chromaticity of the white point of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).@en"],
   :rdfs/label #rdf/langString "WhitePoint@en",
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def width
  "Width of an object"
  {:db/ident           :exif/width,
   :rdf/type           :rdf/Property,
   :rdfs/comment       #rdf/langString "Width of an object@en",
   :rdfs/label         #rdf/langString "Width@en",
   :rdfs/subPropertyOf :exif/length})

(def xResolution
  "XResolution"
  {:db/ident :exif/xResolution,
   :exif/tag_number #rdf/langString "282@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画像の表示・印刷時の水平解像度@ja"
    #rdf/langString
     "The number of pixels per ResolutionUnit in the ImageWidth direction. When the image resolution is unknown, 72 [dpi] is designated.@en"],
   :rdfs/label #rdf/langString "XResolution@en",
   :rdfs/subPropertyOf [:exif/resolution :exif/imageDataStruct]})

(def yCbCrCoefficients
  "YCbCrCoefficients"
  {:db/ident :exif/yCbCrCoefficients,
   :exif/tag_number #rdf/langString "529@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "RGB形式からYCbCr形式に変換するための3つの係数。通常は0.299、0.587、0.114という値@ja"
    #rdf/langString
     "The matrix coefficients for transformation from RGB to YCbCr image data.@en"],
   :rdfs/label #rdf/langString "YCbCrCoefficients@en",
   :rdfs/subPropertyOf :exif/imageDataCharacter})

(def yCbCrPositioning
  "YCbCrPositioning"
  {:db/ident :exif/yCbCrPositioning,
   :exif/tag_number #rdf/langString "531@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString
     "色情報のサンプリングを間引きしている場合に、色情報のサンプルポイントがどこになるか。1='centered'なら点集合の中央、2＝'co-sited'なら点集合の原点@ja"
    #rdf/langString
     "The position of chrominance components in relation to the luminance component. This field is designated only for JPEG compressed data or uncompressed YCbCr data.@en"],
   :rdfs/label #rdf/langString "YCbCrPositioning@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def yCbCrSubSampling
  "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/yCbCrSubSampling,
   :exif/tag_number #rdf/langString "530@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   #rdf/langString
    "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag.@en",
   :rdfs/label #rdf/langString "YCbCrSubSampling@en",
   :rdfs/subPropertyOf :exif/imageDataStruct})

(def yResolution
  "YResolution"
  {:db/ident :exif/yResolution,
   :exif/tag_number #rdf/langString "283@en",
   :rdf/type :rdf/Property,
   :rdfs/comment
   [#rdf/langString "画像の表示・印刷時の垂直解像度@ja"
    #rdf/langString
     "The number of pixels per ResolutionUnit in the ImageLength direction. The same value as XResolution is designated.@en"],
   :rdfs/label #rdf/langString "YResolution@en",
   :rdfs/subPropertyOf [:exif/resolution :exif/imageDataStruct]})
